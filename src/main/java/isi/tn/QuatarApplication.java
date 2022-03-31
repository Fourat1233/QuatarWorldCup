package isi.tn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="isi.tn")
@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan
//@Configuration
public class QuatarApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuatarApplication.class, args);
    }

}


