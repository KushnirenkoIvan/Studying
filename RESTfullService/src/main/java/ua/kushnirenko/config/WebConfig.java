package ua.kushnirenko.config;

import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * author: ivan kushnirenko
 * <p/>
 * date: 09.02.16
 */
@Configuration
public class WebConfig {

    @Bean
    EmbeddedServletContainerFactory embeddedServletContainerFactory() {
        return new TomcatEmbeddedServletContainerFactory(8181);
    }

    
}
