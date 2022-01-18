package com.staffsterr2000.bankapi.service.impl;

import com.staffsterr2000.bankapi.model.Application;
import com.staffsterr2000.bankapi.service.ApplicationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Override
    public Application save(Application application) {
        log.info(application.toString());
        return application;
    }

}
