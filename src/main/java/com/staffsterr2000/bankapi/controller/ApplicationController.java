package com.staffsterr2000.bankapi.controller;

import com.staffsterr2000.bankapi.model.entity.Application;
import com.staffsterr2000.bankapi.model.entity.Response;
import com.staffsterr2000.bankapi.service.ApplicationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/applications")
@Slf4j
public class ApplicationController {

    private final ApplicationService applicationService;

    @PostMapping
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public ResponseEntity<Response> save(@RequestBody Application application, Authentication auth) {
        log.info("-------------------------");
        log.info("Authenticated as: " + auth.getName());
        Response response = applicationService.save(application);
        log.info("Response: " + response);

        return ResponseEntity.ok(response);
    }

}
