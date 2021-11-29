package com.altimetrik.altivisio.controller;

import com.altimetrik.altivisio.model.Domain;
import com.altimetrik.altivisio.model.Project;
import com.altimetrik.altivisio.model.ScrumTeam;
import com.altimetrik.altivisio.service.DomainService;
import com.altimetrik.altivisio.service.ProjectService;
import com.altimetrik.altivisio.service.ScrumTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController("api/v1/projects")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @Autowired
    private DomainService domainService;

    @Autowired
    private ScrumTeamService scrumTeamService;


    @GetMapping("projects/{projectId}")
    @ResponseBody
    public Map<String,String> getProjectId(@PathVariable int projectId){
        return projectService.getProjectDetails(projectId);
    }






}
