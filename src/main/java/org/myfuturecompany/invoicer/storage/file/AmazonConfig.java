package org.myfuturecompany.invoicer.storage.file;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "amazon.s3")
@Getter
@Setter
class AmazonConfig {
    private String endpointUrl;
    private String bucketName;
}
