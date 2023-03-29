package com.enat.multiAccountAPI.config.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class CBSError extends ApiSubError {
    private String errorCode;
    private String errorMessage;

}
