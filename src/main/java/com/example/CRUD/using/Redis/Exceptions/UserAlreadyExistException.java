package com.example.CRUD.using.Redis.Exceptions;

import org.springframework.dao.DuplicateKeyException;

public class UserAlreadyExistException extends DuplicateKeyException {
    public UserAlreadyExistException(String msg) {
        super(msg);
    }

    public UserAlreadyExistException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
