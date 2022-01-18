package com.staffsterr2000.bankapi.service;

import com.staffsterr2000.bankapi.model.entity.Application;
import com.staffsterr2000.bankapi.model.entity.Response;

public interface ApplicationService {

    Response save(Application application);
}
