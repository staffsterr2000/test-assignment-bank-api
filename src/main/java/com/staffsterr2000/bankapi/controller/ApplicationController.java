package com.staffsterr2000.bankapi.controller;

import com.staffsterr2000.bankapi.model.Application;
import com.staffsterr2000.bankapi.service.ApplicationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/applications")
@AllArgsConstructor
public class ApplicationController {

    private final ApplicationService applicationService;

    @PostMapping
//    @PreAuthorize("hasAuthority('ROLE_USER')")
    public ResponseEntity<Application> save(@RequestBody Application application) {
        return ResponseEntity.ok(applicationService.save(application));
    }

    @GetMapping("/{id}")
    public String string(@PathVariable String id) {
        return String.format("success for string %s", id);
    }

}
