package com.patjavahere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SBEhcacheApplication {
	public static void main(String[] args) {
		SpringApplication.run(SBEhcacheApplication.class, args);
	}
}