package com.TicketService.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String messege) {
        super(messege);
    }

}
