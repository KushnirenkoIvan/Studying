package ua.kushnirenko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import ua.kushnirenko.config.WebConfig;

/**
 * author: ivan kushnirenko
 * <p/>
 * date: 09.02.16
 */
@EnableAutoConfiguration
@Import(WebConfig.class)
@ComponentScan({"ua.kushnirenko.rest.controller"})
public class ServiceRunner {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ServiceRunner.class, args);
    }

}
