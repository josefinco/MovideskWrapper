package com.br;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.log4j.Log4j2;

@SpringBootApplication
@Log4j2
public class MovideskWrapperApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovideskWrapperApplication.class, args);
		log.info("Iniciando aplicação...");

	}

}
