package com.altimetrik.altivisio.controller;

import com.altimetrik.altivisio.model.ScrumTeam;
import com.altimetrik.altivisio.service.ScrumTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ScrumTeamController {

    @Autowired
    private ScrumTeamService scrumTeamService;

    @GetMapping("teams/{projectId}/{sprintId}")
    public ResponseEntity<List<ScrumTeam>> getScrumTeam(@PathVariable int projectId,@PathVariable int sprintId){
        return new ResponseEntity<>(scrumTeamService.getByProjectIdSprintId(projectId,sprintId), HttpStatus.ACCEPTED);
    }
}
