package com.example.demo.exception;

public class UserServiceException extends Exception {

	private static final long serialVersionUID = -470180507998010368L;

	public UserServiceException() {
		super();
	}

	public UserServiceException(final String message) {
		super(message);
	}
}
