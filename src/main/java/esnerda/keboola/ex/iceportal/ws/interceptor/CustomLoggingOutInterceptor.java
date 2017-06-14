package esnerda.keboola.ex.iceportal.ws.interceptor;

/**
 * @author David Esner
 */
import java.io.OutputStream;
import java.time.Instant;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.io.CacheAndWriteOutputStream;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.io.CachedOutputStreamCallback;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.Phase;
import org.apache.logging.log4j.Logger;

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
		public void onFlush(CachedOutputStream cos) {
		}

		public void onClose(CachedOutputStream cos) {
			try {
				StringBuilder builder = new StringBuilder();
				builder.append("Logging outbound message: \n");
				builder.append(Instant.now() + ": ");
				cos.writeCacheTo(builder);
				String soapXml = builder.toString();				
				System.out.println(soapXml);
			} catch (Exception e) {
				log.error(e);
			}
		}
	}
}