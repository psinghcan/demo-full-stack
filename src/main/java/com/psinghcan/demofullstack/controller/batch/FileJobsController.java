package com.psinghcan.demofullstack.controller.batch;

import com.psinghcan.demofullstack.domain.batch.FileJob;
import com.psinghcan.demofullstack.service.batch.FileJobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/file-jobs")
public class FileJobsController {

    @Autowired
    private FileJobsService fileJobsService;

    @GetMapping
    public ResponseEntity<List> getAvailableFileJobs(){

        List<FileJob> fileJobs = fileJobsService.getAllFileJobs();
        return ResponseEntity.ok(fileJobs);
    }

    @PostMapping("/start")
    public ResponseEntity startFileJob(@RequestBody FileJob fileJob){

        this.fileJobsService.startFileJob(fileJob);
        return ResponseEntity.ok("file job started");
    }
}
