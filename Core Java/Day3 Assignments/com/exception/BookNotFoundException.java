package com.exception;

public class BookNotFoundException extends Exception{
  
    private String message;
	
	public BookNotFoundException() {
		// TODO Auto-generated constructor stub
	}
	public BookNotFoundException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
		this.message = message;
		
	}
	
	public void displayMessage() {
		System.out.println(getMessage());
	}
	
}
