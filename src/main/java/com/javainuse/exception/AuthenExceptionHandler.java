package com.javainuse.exception;

import com.javainuse.exception.exceptions.NotAllowException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class AuthenExceptionHandler {

    @ExceptionHandler(NotAllowException.class)
    public ResponseEntity<?> duplicate(NotAllowException exception){
        return new ResponseEntity<String>(exception.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
