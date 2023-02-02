package com.sumana.parkinglot.domain.exception;

public class InsufficientParkingLevelsException extends RuntimeException {
    public InsufficientParkingLevelsException(String message) {
        super(message);
    }
}
