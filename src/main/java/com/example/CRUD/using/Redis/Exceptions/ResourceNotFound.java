package com.example.CRUD.using.Redis.Exceptions;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
@NoArgsConstructor
@Getter
public class ResourceNotFound extends RuntimeException {

    private String message;

    public ResourceNotFound(String message) {
        super(message);
        this.message = message;
    }
}
