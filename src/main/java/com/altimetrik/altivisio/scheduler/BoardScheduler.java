package com.altimetrik.altivisio.scheduler;

import com.altimetrik.altivisio.common.Utilities;
import com.altimetrik.altivisio.model.ScrumMetric;
import com.altimetrik.altivisio.model.ScrumTeam;
import com.altimetrik.altivisio.model.response.Jira.AllSprint;
import com.altimetrik.altivisio.model.response.Jira.Board;
import com.altimetrik.altivisio.model.response.Jira.Sprint;
import com.altimetrik.altivisio.model.response.Jira.Value;
import com.altimetrik.altivisio.service.ScrumMetricService;
import com.altimetrik.altivisio.service.ScrumTeamService;
import com.altimetrik.altivisio.service.impl.ScrumMetricServiceImpl;
import com.altimetrik.altivisio.service.impl.ScrumTeamServiceImpl;
import org.hibernate.event.internal.MergeContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

//@Component
public class BoardScheduler {
    Logger log = LoggerFactory.getLogger(ReportingScheduler.class);

//    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ScrumMetricService scrumMetricService;
    @Autowired
    private ScrumTeamService scrumTeamService;

    public BoardScheduler() {
        restTemplate = new RestTemplate();
//        scrumMetricService = new ScrumMetricServiceImpl();
//        scrumTeamService = new ScrumTeamServiceImpl();
    }

    //@Scheduled(cron = "0 * * * * *")
    public void getBoardDetails() {
        log.info("Into getBoardDetails scheduler" + new Date());
        HttpEntity request = new HttpEntity(Utilities.setBasicAuthorizationHeaders());
        ResponseEntity<Board> response = restTemplate.exchange("https://c7h7.atlassian.net/rest/agile/1.0/board", HttpMethod.GET, request, Board.class);
        Board board = response.getBody();
        //List<Integer> sprintIds = getSprintIds(board);
        //System.out.println(sprintIds);
        //List<Sprint> sprints = getSprintDetails(sprintIds);
        prepareScrumMetricsDetails(board);
    }

//    private List<Integer> getSprintIds(Board board) {
//        List<Integer> sprintids = new ArrayList<>();
//        for (Value value : board.values)
//            sprintids.add(value.id);
//        return sprintids;
//    }

    private Sprint getSprintDetails(Integer sprintId) {
        HttpEntity request = new HttpEntity(Utilities.setBasicAuthorizationHeaders());
        ResponseEntity<Sprint> response = restTemplate.exchange("https://c7h7.atlassian.net/rest/agile/1.0/sprint/" + sprintId, HttpMethod.GET, request, Sprint.class);
        return response.getBody();
    }

    private void prepareScrumMetricsDetails(Board board) {
        ScrumMetric scrumMetric = new ScrumMetric();
        for (Value value : board.values) {
            Integer boardid = value.id;
            String projectName = value.location.projectName;
            ScrumTeam team = scrumTeamService.getByName(projectName);
            HttpEntity request = new HttpEntity(Utilities.setBasicAuthorizationHeaders());
            ResponseEntity<AllSprint> response = restTemplate.exchange("https://c7h7.atlassian.net/rest/agile/1.0/board/" + boardid + "/sprint", HttpMethod.GET, request, AllSprint.class);
            AllSprint allSprintsForABoard = response.getBody();
            for (Sprint s : allSprintsForABoard.values) {
                scrumMetric.setSprintId(s.id);
                scrumMetric.setTeamId(team.getId());
                scrumMetric.setAverageLast6Sprint(1);
                scrumMetric.setVelocity(1);
                scrumMetric.setSaydoRatio(1);
                scrumMetric.setBurndownRatio(1);
                scrumMetric.setStatus("G");
                scrumMetricService.save(scrumMetric);
            }
        }
    }

    private Map<String, Integer> getTeamIdByName(Board board) {
        Map<String, Integer> d = new HashMap<>();
        for (Value value : board.values) {
            ScrumTeam scrumTeam = scrumTeamService.getByName(value.location.projectName);
            d.put(value.location.projectName, scrumTeam.getId());
        }
        return d;
    }
}
