package org.apache.camel.component.as2.api.entity;

import org.apache.http.entity.ContentType;
import org.apache.http.util.Args;

public abstract class ApplicationEntity<T> extends MimeEntity
{
	private final T message;

	public ApplicationEntity(T message, ContentType contentType, String contentTransferEncoding, boolean isMainBody)
	{
		this.message = Args.notNull(message, "EDI Message");
		setContentType(Args.notNull(contentType, "Content Type").toString());
		setContentTransferEncoding(contentTransferEncoding);
		setMainBody(isMainBody);
	}

	public T getMessage()
	{
		return message;
	}
}
