package com.staffsterr2000.bankapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Application {

    private List<Applicant> applicants;

    private Integer loanAmount;

    private Integer termYears;

    private Integer applicationId;

}
