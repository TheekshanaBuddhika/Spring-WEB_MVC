package lk.ijse.spring;

import org.springframework.context.annotation.Configuration;

@Configuration
public class WebAppRootConfig {
    public WebAppRootConfig() {
        System.out.println("WebRootConfig - constructor");
    }
}
