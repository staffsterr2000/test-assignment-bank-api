package com.staffsterr2000.bankapi.model.entity;


import com.staffsterr2000.bankapi.model.enumeration.OperationStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Response {

    private UUID id;

    private OperationStatus status;

}
