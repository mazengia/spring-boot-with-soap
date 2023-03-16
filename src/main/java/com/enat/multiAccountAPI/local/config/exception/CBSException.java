package com.enat.multiAccountAPI.local.config.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class CBSException extends RuntimeException {
    private String message;
    private List<CBSError> error;

}
