
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.mail;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.google.api.services.gmail.Gmail$Users$Drafts
 */
@UriParams
@Configurer
public final class GmailUsersDraftsEndpointConfiguration extends GoogleMailConfiguration {

    @UriParam
    private com.google.api.services.gmail.model.Draft content;

    @UriParam
    private String id;

    @UriParam
    private com.google.api.client.http.AbstractInputStreamContent mediaContent;

    @UriParam
    private String userId;

    public com.google.api.services.gmail.model.Draft getContent() {
        return content;
    }

    public void setContent(com.google.api.services.gmail.model.Draft content) {
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public com.google.api.client.http.AbstractInputStreamContent getMediaContent() {
        return mediaContent;
    }

    public void setMediaContent(com.google.api.client.http.AbstractInputStreamContent mediaContent) {
        this.mediaContent = mediaContent;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}