package com.enat.multiAccountAPI.local.config.exception;

import lombok.Getter;

@Getter
public class UnAuthorizedActionException extends RuntimeException {
    private final String message;

    public UnAuthorizedActionException(String msg) {
        this.message = msg;
    }

}
