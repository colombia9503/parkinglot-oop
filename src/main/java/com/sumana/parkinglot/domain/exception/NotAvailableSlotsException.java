package com.sumana.parkinglot.domain.exception;

public class NotAvailableSlotsException extends RuntimeException {
    public NotAvailableSlotsException(String message) {
        super(message);
    }
}
