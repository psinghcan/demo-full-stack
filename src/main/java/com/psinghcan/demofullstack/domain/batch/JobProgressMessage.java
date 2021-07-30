package com.psinghcan.demofullstack.domain.batch;

import lombok.Data;

@Data
public class JobProgressMessage {
    private String status;
    private String fileName;
    private double writeCount;
    private double percentageComplete;
}
