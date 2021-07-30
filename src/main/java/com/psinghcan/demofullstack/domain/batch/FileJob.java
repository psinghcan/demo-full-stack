package com.psinghcan.demofullstack.domain.batch;

import lombok.Data;

@Data
public class FileJob {
    private String fileName;
    private String absolutePath;
}
