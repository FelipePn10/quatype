package com.service.patient.exception;

public class EmailAlreadyExistsExecption extends RuntimeException {
    public EmailAlreadyExistsExecption(String message) {
        super(message);
    }
}
