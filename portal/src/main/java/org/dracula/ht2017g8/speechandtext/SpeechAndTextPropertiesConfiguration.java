package org.dracula.ht2017g8.speechandtext;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({BaiduAipProperties.class, SpeechAndTextProperties.class})
public class SpeechAndTextPropertiesConfiguration {


}
