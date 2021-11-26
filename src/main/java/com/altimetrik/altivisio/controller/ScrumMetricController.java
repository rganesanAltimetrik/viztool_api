package com.altimetrik.altivisio.controller;

import com.altimetrik.altivisio.model.Domain;
import com.altimetrik.altivisio.model.Project;
import com.altimetrik.altivisio.model.response.SprintDeliveryVO;
import com.altimetrik.altivisio.model.response.VelocityVO;
import com.altimetrik.altivisio.service.ProjectService;
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

    @GetMapping("metrics/{projectId}")
    @ResponseBody
    public ResponseEntity<Project> velocityMetrics(@PathVariable int projectId){
        projectService.save(new Project("Ancestry","Siva"));
        return new ResponseEntity<>(new Project(), HttpStatus.OK);
    }

    @GetMapping("metrics/{projectId}/{domainId}")
    public ResponseEntity<Domain> sprintDelivery(@PathVariable int projectId, @PathVariable int domainId){
        return new ResponseEntity<>(new Domain(), HttpStatus.OK);
    }
}
