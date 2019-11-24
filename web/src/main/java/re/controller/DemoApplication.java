package re.controller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"rc.persistance"})
@EntityScan(basePackages = {"rc.domain"})
@ComponentScan(basePackages = {"rc.domain","rc.persistance","re.controller"})
public class DemoApplication {


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class);
    }









}
