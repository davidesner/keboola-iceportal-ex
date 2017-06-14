package esnerda.keboola.ex.iceportal.ws.interceptor;

import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.time.Instant;

import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.io.DelegatingInputStream;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.Phase;
import org.apache.logging.log4j.Logger;

public class CustomLoggingInInterceptor extends LoggingInInterceptor {
	
	private Logger log;

	public CustomLoggingInInterceptor(Logger log) {
		super(Phase.PRE_STREAM);
		this.log = log;
	}

	@Override
	public void handleMessage(Message message) throws Fault {
		message.getContentFormats();
		 InputStream is = message.getContent(InputStream.class);
	        CachedOutputStream bos = new CachedOutputStream();	       
	        if (threshold > 0) {
	            bos.setThreshold(threshold);
	        }
	        try {
	            // use the appropriate input stream and restore it later
	            InputStream bis = is instanceof DelegatingInputStream 
	                ? ((DelegatingInputStream)is).getInputStream() : is;
	            

	            //only copy up to the limit since that's all we need to log
	            //we can stream the rest
	            IOUtils.copyAtLeast(bis, bos, limit == -1 ? Integer.MAX_VALUE : limit);	            
	            bis = new SequenceInputStream(bos.getInputStream(), bis);
	            
	            // restore the delegating input stream or the input stream
	            if (is instanceof DelegatingInputStream) {
	                ((DelegatingInputStream)is).setInputStream(bis);
	            } else {
	                message.setContent(InputStream.class, bis);
	            }
	            writePayload(bos);
	    		
	        } catch (Exception e) {
	            throw new Fault(e);
	        }
		
	}

	protected void writePayload(CachedOutputStream cos) throws IOException {
		StringBuilder builder = new StringBuilder();
		builder.append("Logging inbound message: \n");
		builder.append(Instant.now() + ": ");
		cos.writeCacheTo(builder);
		String soapXml = builder.toString();	
		log.info(soapXml);
	}	
}