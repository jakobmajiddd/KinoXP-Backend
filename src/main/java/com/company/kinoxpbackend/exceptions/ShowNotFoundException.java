package com.company.kinoxpbackend.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ShowNotFoundException extends Exception{

    public ShowNotFoundException(String message) {
        super(message);
    }
}
