package br.com.easypet.easypet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class EasyPetApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyPetApplication.class, args);
	}
}
