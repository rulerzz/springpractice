package com.webapp.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Serializable;

@SpringBootApplication
public class ServicesApplication implements Serializable {
	public static void main(String[] args) {
		SpringApplication.run(ServicesApplication.class, args);
	}

}
