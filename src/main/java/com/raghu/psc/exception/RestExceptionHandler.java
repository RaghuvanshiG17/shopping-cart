package com.raghu.psc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {
	
	@ExceptionHandler(value = B2CException.class)
	public ResponseEntity<ErrorResponse> handleB2CExceptionNotFound(
			B2CException b2cException){
	ErrorResponse errorResponse = new ErrorResponse(
				b2cException.getMessage(),
				HttpStatus.NOT_FOUND
			);
	return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.NOT_FOUND);
	}
	
}
