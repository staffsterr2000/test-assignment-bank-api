package com.staffsterr2000.bankapi.controller;

import com.staffsterr2000.bankapi.model.entity.Application;
import com.staffsterr2000.bankapi.model.entity.Response;
import com.staffsterr2000.bankapi.service.ApplicationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/applications")
public class ApplicationController {

    private final ApplicationService applicationService;

    @PostMapping
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public ResponseEntity<Response> save(@RequestBody Application application) {
        return ResponseEntity.ok(applicationService.save(application));
    }

}
