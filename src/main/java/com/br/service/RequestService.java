package com.br.service;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RequestService {

	public void getuserInformation(String movideskEndpoint, String movideskToken) throws IOException {

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> call = restTemplate
				.getForEntity(movideskEndpoint + "tickets?token=" + movideskToken + "&id=16572", String.class);
		System.out.println(call.getBody());

	}
}
