package com.staffsterr2000.bankapi.service.impl;

import com.staffsterr2000.bankapi.exception.UnsuccessfulOperationException;
import com.staffsterr2000.bankapi.model.Application;
import com.staffsterr2000.bankapi.model.Response;
import com.staffsterr2000.bankapi.model.enumeration.Status;
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
        log.info(application.toString());

        boolean isOperationSuccessful = new Random().nextBoolean();
        if (!isOperationSuccessful)
            throw new UnsuccessfulOperationException();

        return Response.builder().id(UUID.randomUUID()).status(Status.SUCCESS).build();
    }

}
