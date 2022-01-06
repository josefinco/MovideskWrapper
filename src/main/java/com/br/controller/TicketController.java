package com.br.controller;

import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.br.exceptions.ExceptionMessageHandler;
import com.br.model.Root;
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

	@Autowired
	ExceptionMessageHandler exceptionHandler;

	RequestService requestService = new RequestService();

	@PostMapping(path = "tickets", produces = "application/json")
	public ResponseEntity<?> create(@RequestHeader("api-key") String key, @RequestBody Root body) {
		UUID uuid = UUID.randomUUID();
		log.info(uuid + " | Recebendo nova requisição para criação de ticket ");
		log.debug(body);
		try {
			log.debug(uuid + " | Requisitando informações para o Movidesk");
			ResponseEntity<String> responseEntity = requestService.createTicket(movideskEndpoint, movideskToken, body);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(responseEntity.getBody());

		} catch (Exception e) {
			log.error(uuid + " | Erro ao efetuar requisição ao Movidesk");
			log.error(e.getMessage());
			return exceptionHandler.exceptionHandler(e);
		}

	}
}
