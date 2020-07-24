package org.apache.camel.component.as2.api.entity;

import org.apache.http.entity.ContentType;

public class ApplicationPDFEntity extends ApplicationOctetStreamEntity
{
	public ApplicationPDFEntity(byte[] message, ContentType contentType, String contentTransferEncoding, boolean isMainBody)
	{
		super(message, contentType, contentTransferEncoding, isMainBody);
	}
}
