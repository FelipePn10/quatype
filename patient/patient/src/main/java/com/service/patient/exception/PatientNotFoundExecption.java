package com.service.patient.exception;

public class PatientNotFoundExecption extends RuntimeException {
    public PatientNotFoundExecption(String message) {
        super(message);
    }
}
