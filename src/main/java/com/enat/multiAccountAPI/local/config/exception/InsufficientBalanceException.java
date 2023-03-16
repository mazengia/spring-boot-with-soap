package com.enat.multiAccountAPI.local.config.exception;

import lombok.Data;

@Data
public class InsufficientBalanceException extends RuntimeException {
    private String message;

    public InsufficientBalanceException(String message) {
        this.message = message;
    }
}
