package com.br.service;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.br.model.Root;

public class RequestService {

	public ResponseEntity<String>  createTicket(String movideskEndpoint, String movideskToken, Root body) throws IOException {

		String requestURL = movideskEndpoint + "tickets?token=" + movideskToken + "&returnAllProperties=false";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> responseEntity = restTemplate.postForEntity(requestURL, body, String.class);
		System.out.println(responseEntity.getBody());
		System.out.println(responseEntity.getBody().toString());
		System.out.println(responseEntity.getStatusCode());
		
		return responseEntity;
		
	}
}
