package org.apache.camel.component.as2.api.entity;

import java.io.IOException;
import java.io.OutputStream;

import org.apache.camel.component.as2.api.AS2Charset;
import org.apache.camel.component.as2.api.CanonicalOutputStream;
import org.apache.camel.component.as2.api.util.EntityUtils;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.entity.ContentType;

public class ApplicationOctetStreamEntity extends ApplicationEntity<byte[]>
{
	public ApplicationOctetStreamEntity(byte[] message, ContentType contentType, String contentTransferEncoding, boolean isMainBody)
	{
		super(message, contentType, contentTransferEncoding, isMainBody);
	}

	@Override
	public void writeTo(OutputStream outstream) throws IOException
	{
		NoCloseOutputStream ncos = new NoCloseOutputStream(outstream);
		try (CanonicalOutputStream canonicalOutstream = new CanonicalOutputStream(ncos, AS2Charset.US_ASCII);
		     OutputStream transferEncodedStream = EntityUtils.encode(canonicalOutstream, getContentTransferEncodingValue())) {

			// Write out mime part headers if this is not the main body of message.
			if (!isMainBody()) {
				HeaderIterator it = headerIterator();
				while (it.hasNext()) {
					Header header = it.nextHeader();
					canonicalOutstream.writeln(header.toString());
				}
				canonicalOutstream.writeln(); // ensure empty line between headers and body; RFC2046 - 5.1.1
			}

			byte[] message = getMessage();
			transferEncodedStream.write(message, 0, message.length);
		} catch (Exception e) {
			throw new IOException("Failed to write to output stream", e);
		}
	}
}
