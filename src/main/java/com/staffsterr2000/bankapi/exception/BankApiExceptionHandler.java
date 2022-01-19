package com.staffsterr2000.bankapi.exception;

import com.staffsterr2000.bankapi.model.entity.Response;
import com.staffsterr2000.bankapi.model.enumeration.OperationStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.UUID;

@ControllerAdvice
@Slf4j
public class BankApiExceptionHandler {

    @ExceptionHandler(UnsuccessfulOperationException.class)
    protected ResponseEntity<Response> handleUnsuccessfulOperationException() {
        Response response = Response.builder().id(UUID.randomUUID()).status(OperationStatus.FAILED).build();
        log.info("Response: " + response);

        return ResponseEntity.badRequest().body(response);
    }
}
