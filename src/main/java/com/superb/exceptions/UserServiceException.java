package com.superb.exceptions;

public class UserServiceException extends RuntimeException {
	
	private static final long serialVersionUID = 6573925422522984452L;

	public UserServiceException(String message) {
		super(message);
	}
}
