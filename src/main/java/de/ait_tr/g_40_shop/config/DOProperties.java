package de.ait_tr.g_40_shop.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "do")
public class DOProperties {

    private String accessKey;
    private String secretKey;
    private String endpoint;
    private String region;

    public DOProperties(String secretKey, String endpoint, String region) {
        this.secretKey = secretKey;
        this.endpoint = endpoint;
        this.region = region;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public String getRegion() {
        return region;
    }
}
