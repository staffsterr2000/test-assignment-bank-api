package com.staffsterr2000.bankapi.service.impl;

import com.staffsterr2000.bankapi.exception.UnsuccessfulOperationException;
import com.staffsterr2000.bankapi.model.entity.Application;
import com.staffsterr2000.bankapi.model.entity.Response;
import com.staffsterr2000.bankapi.model.enumeration.OperationStatus;
import com.staffsterr2000.bankapi.service.ApplicationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Slf4j
@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Override
    public Response save(Application application) {
        log.info("Application: " + application);

        boolean isOperationSuccessful = new Random().nextBoolean();
        if (!isOperationSuccessful)
            throw new UnsuccessfulOperationException();

        return Response.builder().id(UUID.randomUUID()).status(OperationStatus.SUCCESS).build();
    }

}
