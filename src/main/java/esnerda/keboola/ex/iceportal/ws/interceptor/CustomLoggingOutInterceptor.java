package esnerda.keboola.ex.iceportal.ws.interceptor;

import java.io.ByteArrayInputStream;
/**
 * @author David Esner
 */
import java.io.OutputStream;
import java.io.StringWriter;
import java.time.Instant;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.io.CacheAndWriteOutputStream;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.io.CachedOutputStreamCallback;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.Phase;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class CustomLoggingOutInterceptor extends LoggingOutInterceptor {

	private Logger log;

	public CustomLoggingOutInterceptor(Logger log) {
		super(Phase.PRE_STREAM);
		this.log = log;
	}

	@Override
	public void handleMessage(Message message) throws Fault {
		message.getContentFormats();
		OutputStream out = message.getContent(OutputStream.class);
		final CacheAndWriteOutputStream newOut = new CacheAndWriteOutputStream(out);
		message.setContent(OutputStream.class, newOut);
		newOut.registerCallback(new LoggingCallback());
	}

	public class LoggingCallback implements CachedOutputStreamCallback {
		private static final String AUTH_HEADER = "ICEAuthHeaderWithMType";

		public void onFlush(CachedOutputStream cos) {
		}

		public void onClose(CachedOutputStream cos) {
			try {
				StringBuilder builder = new StringBuilder();
				cos.writeCacheTo(builder);
				String soapXml = removeCredentials(builder.toString());
				soapXml = "Logging outbound message: \n" + Instant.now() + ": " + soapXml;
				log.info(soapXml);
			} catch (Exception e) {
				log.error(e,e);
			}
		}

		private String removeCredentials(String message) throws Exception {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(new ByteArrayInputStream(message.getBytes()));
			NodeList s = doc.getElementsByTagName(AUTH_HEADER);
			NodeList headNodes = s.item(0).getChildNodes();
			for (int i = 0; i < headNodes.getLength(); i++) {
				headNodes.item(i).setTextContent("***");
			}
			DOMSource domSource = new DOMSource(doc);
			StringWriter writer = new StringWriter();
			StreamResult result = new StreamResult(writer);
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer transformer = tf.newTransformer();
			transformer.transform(domSource, result);
			return writer.toString();

		}
	}

}