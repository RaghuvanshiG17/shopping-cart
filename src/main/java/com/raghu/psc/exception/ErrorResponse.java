package com.raghu.psc.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
public class ErrorResponse {
	
	private String errorMessage;
	private HttpStatus htpHttp;
	
	public ErrorResponse(String message, HttpStatus httpStatus) {
		this.errorMessage = message;
		this.htpHttp = httpStatus;
	}
	
}
