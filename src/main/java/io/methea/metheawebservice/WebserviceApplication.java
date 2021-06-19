package io.methea.metheawebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"io.github.metheax", "io.methea"})
@EnableJpaRepositories(basePackages = {"io.github.metheax", "io.methea"})
@EntityScan(basePackages = {"io.github.metheax", "io.methea"})
@ComponentScan(basePackages = {"io.github.metheax", "io.methea"})
public class WebserviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebserviceApplication.class, args);
    }
}
