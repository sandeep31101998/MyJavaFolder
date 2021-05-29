package com.technoelevate.customexception;
//unchecked exception
public class AgeValidator extends RuntimeException {

	public AgeValidator(String message) {
		super(message);
	}

	
}
