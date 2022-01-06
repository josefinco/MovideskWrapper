package com.br.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
/**
 * 
 * @author José Finco Classe para tratamento de Exception
 *         
 *
 */
@ControllerAdvice
public class ExceptionMessageHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> exceptionHandler(Exception e) {
		MessageHandler messageHandler = new MessageHandler();
		String exception = e.getClass().getSimpleName();
		switch (exception) {
		case "NullPointerException":
			return messageHandler.responseMessage("Valor inexistente. Verifique o parâmetro inserido!",
					HttpStatus.BAD_REQUEST);
		}
		return messageHandler.responseMessage("Valor inexistente. Verifique o parâmetro inserido!",
				HttpStatus.BAD_REQUEST);
	}
}