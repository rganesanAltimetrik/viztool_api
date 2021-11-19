package com.altimetrik.altivisio.controller;

import com.altimetrik.altivisio.model.response.SprintDeliveryVO;
import com.altimetrik.altivisio.model.response.VelocityVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("metrics")
public class ScrumMetricController {

    @GetMapping("velocity/{projectId}")
    @ResponseBody
    public ResponseEntity<VelocityVO> velocityMetrics(@PathVariable int projectId){
        return new ResponseEntity<>(new VelocityVO(), HttpStatus.OK);
    }

    @GetMapping("sprint/delivery/{projectId}/{teamId}")
    public ResponseEntity<SprintDeliveryVO> sprintDelivery(@PathVariable int projectId, @PathVariable int teamId){
        return new ResponseEntity<>(new SprintDeliveryVO(), HttpStatus.OK);
    }
}
