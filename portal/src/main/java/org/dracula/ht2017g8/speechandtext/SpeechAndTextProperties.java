package org.dracula.ht2017g8.speechandtext;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;

/**
 * @author dk
 */
@ManagedResource
@ConfigurationProperties(prefix = "speechandtext")
public class SpeechAndTextProperties {

    private String inputLocation;

    private String outputLocation;

    @ManagedAttribute
    public String getInputLocation() {
        return inputLocation;
    }

    @ManagedAttribute
    public void setInputLocation(String inputLocation) {
        this.inputLocation = inputLocation;
    }

    @ManagedAttribute
    public String getOutputLocation() {
        return outputLocation;
    }

    @ManagedAttribute
    public void setOutputLocation(String outputLocation) {
        this.outputLocation = outputLocation;
    }
}
