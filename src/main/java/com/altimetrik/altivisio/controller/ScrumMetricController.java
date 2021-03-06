package com.altimetrik.altivisio.controller;

import com.altimetrik.altivisio.model.Domain;
import com.altimetrik.altivisio.model.Project;

import com.altimetrik.altivisio.model.ScrumMetric;
import com.altimetrik.altivisio.model.response.SprintDeliveryVO;
import com.altimetrik.altivisio.model.response.VelocityVO;
import com.altimetrik.altivisio.scheduler.ReportingScheduler;
import com.altimetrik.altivisio.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.altimetrik.altivisio.model.ScrumTeam;
import com.altimetrik.altivisio.service.ProjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController("api/v1")
public class ScrumMetricController {

    Logger log = LoggerFactory.getLogger(ScrumMetricController.class);

    @Autowired
    private ProjectService projectService;

    @Autowired
    private DomainService domainService;

    @Autowired
    private ScrumTeamService scrumTeamService;

    @Autowired
    private ScrumMetricService scrumMetricService;


    @GetMapping("metrics8/{scrumId}/{teamId}")
    @ResponseBody
    public ResponseEntity<List<ScrumMetric>> velocityMetrics(@PathVariable int scrumId,@PathVariable int teamId){
       List<ScrumMetric> scrumMetricList = scrumMetricService.getByScrumIdTeamId(scrumId, teamId);
        return new ResponseEntity<>(scrumMetricList, HttpStatus.OK);
    }

    @GetMapping("metrics1/{projectId}")
    @ResponseBody
    public ResponseEntity<Project> velocityMetrics1(@PathVariable int projectId){
        Domain domain = domainService.get(projectId);
        return new ResponseEntity<>(new Project(), HttpStatus.OK);
    }

    /*@GetMapping("metrics/{projectId}/{domainId}")
    public ResponseEntity<Domain> sprintDelivery(@PathVariable int projectId, @PathVariable int domainId){
        domainService.save(new Domain(projectId, "Content-Tech", "Create and Manage Tools for Content Operations team to manage Content", "FixedCapacity", "01-Aug-2017", "None", "Scrum", "Richard Blight", "Bharathi K, Lazer & Saranya", "Neel & Padma", "AWS, MySQL, JAVA, React JS, Node", "G"));
        return new ResponseEntity<>(new Domain(), HttpStatus.OK);
    }*/

    @GetMapping("metrics/teams/{domainId}")
    public ResponseEntity<ScrumTeam> getScrumTeams(@PathVariable int domainId){
        scrumTeamService.save(new ScrumTeam(domainId, "Team-42", "Vendor - Altimetrik India", 8));
        return new ResponseEntity<>(new ScrumTeam(), HttpStatus.OK);
    }




}
