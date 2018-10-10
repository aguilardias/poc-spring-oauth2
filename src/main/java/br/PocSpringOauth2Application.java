package br;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@SpringBootApplication
public class PocSpringOauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(PocSpringOauth2Application.class, args);
	}
}
