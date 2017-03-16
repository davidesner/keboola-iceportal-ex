package esnerda.keboola.ex.iceportal.ws.interceptor;

import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.apache.cxf.phase.Phase;

/**
 * @author David Esner
 */
public class AuthHeaderInterceptor extends AbstractSoapInterceptor {

	private final Object authHeader;
	private final Class authHeaderType;


	public AuthHeaderInterceptor(Object authHeader, Class authHeaderType) {
		super(Phase.POST_LOGICAL);
		this.authHeader = authHeader;
		this.authHeaderType = authHeaderType;
	}

	@Override
	public void handleMessage(SoapMessage message) throws Fault {
		List<Header> headers = message.getHeaders();

		try {
			Header header = new Header(new QName(authHeaderType.getSimpleName()), authHeader,
					new JAXBDataBinding(authHeaderType));
			headers.add(header);
			message.put(Header.HEADER_LIST, headers);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
    }
