package com.example.shopping.exceptions;

public class ExpiredTokenException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ExpiredTokenException(String message) {
		super(message);
	}
}
