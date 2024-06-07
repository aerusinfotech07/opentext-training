package com.example.demo.exception;

import java.util.Date;

public class ExceptionResponse {

	private String errorMessage;
	private String requestedURI;
	private Date timestamp;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(final String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getRequestedURI() {
		return requestedURI;
	}

	public void callerURL(final String requestedURI) {
		this.requestedURI = requestedURI;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public void setRequestedURI(String requestedURI) {
		this.requestedURI = requestedURI;
	}
	
	
	
	
	
}