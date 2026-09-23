package com.climbthepeak.climbthepeak.exception;

import org.springframework.stereotype.Component;


public class ErrorResponse {
 String message;
 int status;
public ErrorResponse(String message , int status)
    {
        this.message = message ;
        this.status = status;

    }

}
