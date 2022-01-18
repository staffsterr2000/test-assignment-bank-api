package com.staffsterr2000.bankapi.model;


import com.staffsterr2000.bankapi.model.enumeration.Status;
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
    private Status status;

}
