package com.enat.multiAccountAPI.cbs;

import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter
@AllArgsConstructor
public enum DrCr {
    DEBIT("D"), CREDIT("C");
    private final String type;
    @Override
    public String toString() {
        return type;
    }
}

