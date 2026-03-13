package com.projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class EcosDaGuerraApplication {


	public static void main(String[] args) {
		SpringApplication.run(EcosDaGuerraApplication.class, args);
	}

}





