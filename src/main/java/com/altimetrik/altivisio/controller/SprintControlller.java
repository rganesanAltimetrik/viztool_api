package com.altimetrik.altivisio.controller;

import com.altimetrik.altivisio.model.Project;
import com.altimetrik.altivisio.model.Sprint;
import com.altimetrik.altivisio.service.SprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("api/")
public class SprintControlller {

    @Autowired
    private SprintService sprintService;

    @GetMapping("/v1/sprints")
    public ResponseEntity<List<Sprint>> getAll() {
        return new ResponseEntity<>(sprintService.getAll(), HttpStatus.ACCEPTED);
    }
}