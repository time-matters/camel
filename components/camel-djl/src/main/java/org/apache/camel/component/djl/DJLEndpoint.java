package org.apache.camel.component.djl;

import ai.djl.Application;
import org.apache.camel.Consumer;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.apache.camel.spi.Metadata;
import org.apache.camel.spi.UriEndpoint;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriPath;
import org.apache.camel.support.DefaultEndpoint;

/**
 * Represents a DJL endpoint.
 */
@UriEndpoint(firstVersion = "3.2.0", scheme = "djl", title = "DJL", syntax = "djl:application", label = "djl", producerOnly = true)
public class DJLEndpoint extends DefaultEndpoint {

    @UriPath @Metadata(required = true, description = "Application name")
    private String application;

    @Metadata(required = false)
    @UriParam(label = "producer", description = "Model Artifact")
    private String artifactId;

    @Metadata(required = false)
    @UriParam(label = "producer", description = "Model")
    private String model;

    @Metadata(required = false)
    @UriParam(label = "producer", description = "Translator")
    private String translator;

    public DJLEndpoint(String uri, DJLComponent component, String application) {
        super(uri, component);
        this.application = application;
    }

    public Producer createProducer() throws Exception {
        return new DJLProducer(this);
    }

    public Consumer createConsumer(Processor processor) throws Exception {
        throw new UnsupportedOperationException("Consumer not supported");
    }

    public boolean isSingleton() {
        return true;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }
}