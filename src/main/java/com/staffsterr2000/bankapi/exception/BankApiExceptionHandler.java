package com.staffsterr2000.bankapi.exception;

import com.staffsterr2000.bankapi.model.Response;
import com.staffsterr2000.bankapi.model.enumeration.Status;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.UUID;

@ControllerAdvice
public class BankApiExceptionHandler {

    @ExceptionHandler(UnsuccessfulOperationException.class)
    protected ResponseEntity<Response> handleUnsuccessfulOperationException() {
        return ResponseEntity.badRequest().body(
                Response.builder().id(UUID.randomUUID()).status(Status.FAILED).build());
    }
}
