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


@RestController("api/v1")
public class ScrumMetricController {

    @Autowired
    private ProjectService projectService;

    @Autowired
    private DomainService domainService;

    @Autowired
    private ScrumTeamService scrumTeamService;

    @GetMapping("metrics/{projectId}")
    @ResponseBody
    public ResponseEntity<Project> velocityMetrics(@PathVariable int projectId){
        projectService.save(new Project("Content-Tech","Bharathi"));
        return new ResponseEntity<>(new Project(), HttpStatus.OK);
    }

    @GetMapping("metrics/{projectId}/{domainId}")
    public ResponseEntity<Domain> sprintDelivery(@PathVariable int projectId, @PathVariable int domainId){
        domainService.save(new Domain(projectId, "Content-Tech", "Create and Manage Tools for Content Operations team to manage Content", "FixedCapacity", "01-Aug-2017", "None", "Scrum", "Richard Blight", "Bharathi K, Lazer & Saranya", "Neel & Padma", "AWS, MySQL, JAVA, React JS, Node", "G"));
        return new ResponseEntity<>(new Domain(), HttpStatus.OK);
    }

    @GetMapping("metrics/teams/{domainId}")
    public ResponseEntity<ScrumTeam> getScrumTeams(@PathVariable int domainId){
        scrumTeamService.save(new ScrumTeam(domainId, "Team-42", "Vendor - Altimetrik India", 8));
        return new ResponseEntity<>(new ScrumTeam(), HttpStatus.OK);
    }




}
