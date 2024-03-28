package lk.ijse.spring.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"lk.ijse.spring.service","lk.ijse.spring.repositories"})
@Import(JPAConfig.class)
public class WebRootConfig {
}
