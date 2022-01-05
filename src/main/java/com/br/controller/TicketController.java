package com.br.controller;

import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.br.service.RequestService;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@CrossOrigin
public class TicketController {

	@Value("${movidesk.endpoint}")
	String movideskEndpoint;

	@Value("${movidesk.token}")
	String movideskToken;

	@PostMapping(path = "tickets", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> create(@RequestHeader("api-key") String key) {
		RequestService requestService = new RequestService();

		UUID uui = UUID.randomUUID();

		log.info("Recebendo nova requisição para criação de ticket ");
		try {
			log.debug(uui + " | Requisitando informações para o Movidesk");
			requestService.getuserInformation(movideskEndpoint, movideskToken);
			
		} catch (IOException e) {
			log.error(uui + " | Erro ao efetuar requisição ao Movidesk");
			log.error(e.getMessage());
		}

		return null;

	}
}
