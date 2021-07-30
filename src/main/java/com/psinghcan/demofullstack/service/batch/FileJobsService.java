package com.psinghcan.demofullstack.service.batch;

import com.psinghcan.demofullstack.domain.batch.FileJob;

import java.util.List;

public interface FileJobsService {
    List<FileJob> getAllFileJobs();
    void startFileJob(FileJob fileJob);
}
