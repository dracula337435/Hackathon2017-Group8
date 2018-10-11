package org.dracula.ht2017g8.speechandtext;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;

/**
 * @author dk
 */
@ManagedResource
@ConfigurationProperties(prefix = "baidu.aip")
public class BaiduAipProperties {

    private String appId;

    private String apiKey;

    private String secretKey;

    @ManagedAttribute
    public String getAppId() {
        return appId;
    }

    @ManagedAttribute
    public void setAppId(String appId) {
        this.appId = appId;
    }

    @ManagedAttribute
    public String getApiKey() {
        return apiKey;
    }

    @ManagedAttribute
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    @ManagedAttribute
    public String getSecretKey() {
        return secretKey;
    }

    @ManagedAttribute
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}
