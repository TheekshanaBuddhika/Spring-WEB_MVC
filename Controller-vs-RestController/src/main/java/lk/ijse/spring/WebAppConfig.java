package lk.ijse.spring;


import lk.ijse.spring.api.MyController1;
import lk.ijse.spring.api.MyController2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class WebAppConfig {
    public WebAppConfig() {
        System.out.println("WebAppConfig - constructor");
    }

    @Bean
    public MyController1 getController1(){
        return new MyController1();
    }

    @Bean
    public MyController2 getController2(){
        return new MyController2();
    }


}
