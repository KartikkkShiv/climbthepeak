package com.climbthepeak.climbthepeak.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandller {
    @ExceptionHandler(UserException.class)
    public ResponseEntity<String>handleUserexception (UserException exception)
    {
        ErrorResponse errorResponse = new ErrorResponse(exception.getMessage(),404);

        return ResponseEntity.status(errorResponse.status).body(errorResponse.message);
    }


}
