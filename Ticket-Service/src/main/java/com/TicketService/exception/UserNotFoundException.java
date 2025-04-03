package com.TicketService.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String messege) {
        super(messege);
    }
}
