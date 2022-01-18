package com.staffsterr2000.bankapi.exception;

import com.staffsterr2000.bankapi.model.entity.Response;
import com.staffsterr2000.bankapi.model.enumeration.OperationStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.UUID;

@ControllerAdvice
public class BankApiExceptionHandler {

    @ExceptionHandler(UnsuccessfulOperationException.class)
    protected ResponseEntity<Response> handleUnsuccessfulOperationException() {
        return ResponseEntity.badRequest().body(
                Response.builder().id(UUID.randomUUID()).status(OperationStatus.FAILED).build());
    }
}
