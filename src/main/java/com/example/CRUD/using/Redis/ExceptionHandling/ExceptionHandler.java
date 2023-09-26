package com.example.CRUD.using.Redis.ExceptionHandling;

import com.example.CRUD.using.Redis.ExceptionHandling.ExceptionDTO.ExceptionResponse;
import com.example.CRUD.using.Redis.Exceptions.ResourceNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {ResourceNotFound.class})
    public ResponseEntity<ExceptionResponse> resourceNotFoundExcetionHandeler(ResourceNotFound ex)
    {
        return new ResponseEntity<ExceptionResponse>(ExceptionResponse.builder().message(ex.getMessage()).build(), HttpStatus.NOT_FOUND);
    }
}
