package ro.samuel.pronto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ProntoPizzaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProntoPizzaApplication.class, args);
    }

}
