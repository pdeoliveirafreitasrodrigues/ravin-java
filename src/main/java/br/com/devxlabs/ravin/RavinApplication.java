package br.com.devxlabs.ravin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class RavinApplication {

	public static void main(String[] args) {
		SpringApplication.run(RavinApplication.class, args);
	}

}
