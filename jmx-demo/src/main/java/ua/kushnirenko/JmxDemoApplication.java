package ua.kushnirenko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import ua.kushnirenko.config.WebConfig;

@SpringBootApplication
@Import({WebConfig.class})
public class JmxDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JmxDemoApplication.class, args);
    }
}
