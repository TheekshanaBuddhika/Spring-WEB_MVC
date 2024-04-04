package lk.ijse.spring.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"lk.ijse.spring.service","lk.ijse.spring.repositories"})
@Import(JPAConfig.class)
@PropertySource("classpath:application.properties.properties")
public class WebRootConfig {
}
