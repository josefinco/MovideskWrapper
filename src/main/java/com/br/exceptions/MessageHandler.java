package com.br.exceptions;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.br.model.ResponseMessage;

@Component
public class MessageHandler {
	public ResponseEntity<Object> responseOK(JSONObject message) {
		return ResponseEntity.status(HttpStatus.OK).body(message.toString());
	}

	public ResponseEntity<Object> responseMessage(JSONObject message, HttpStatus httpStatus) {
		return ResponseEntity.status(httpStatus).body(message.toString());
	}

	public ResponseEntity<Object> responseMessage(ResponseMessage message, HttpStatus httpStatus) {
		return ResponseEntity.status(httpStatus).body(new JSONObject(message).toString());
	}

	public ResponseEntity<Object> responseMessage(String responseMessage, HttpStatus httpStatus) {
		return ResponseEntity.status(httpStatus).body(new ResponseMessage(responseMessage, httpStatus.toString()));
	}
}
