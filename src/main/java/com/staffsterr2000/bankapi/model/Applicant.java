package com.staffsterr2000.bankapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Applicant {

    private String name;

    private String surname;

    private String email;

    private Boolean isEmployed;

    private LocalDate employedSince;

    private Integer monthlyIncome;

    private String address;

}
