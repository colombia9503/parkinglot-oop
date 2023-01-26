package com.sumana.parkinglot.domain.exception;

public class InsufficientSlotsPerLevelException extends RuntimeException {
    public InsufficientSlotsPerLevelException(String message) {
        super(message);
    }
}
