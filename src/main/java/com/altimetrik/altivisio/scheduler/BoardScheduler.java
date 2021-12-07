package com.altimetrik.altivisio.scheduler;

import com.altimetrik.altivisio.common.Utilities;
import com.altimetrik.altivisio.model.ScrumMetric;
import com.altimetrik.altivisio.model.ScrumTeam;
import com.altimetrik.altivisio.model.response.Jira.Board;
import com.altimetrik.altivisio.model.response.Jira.Sprint;
import com.altimetrik.altivisio.model.response.Jira.Value;
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

@Component
public class BoardScheduler {
    Logger log = LoggerFactory.getLogger(ReportingScheduler.class);

    private RestTemplate restTemplate;
    private ScrumMetricServiceImpl scrumMetricService;
    private ScrumTeamServiceImpl scrumTeamService;

    public BoardScheduler() {
        restTemplate = new RestTemplate();
        scrumMetricService = new ScrumMetricServiceImpl();
        scrumTeamService = new ScrumTeamServiceImpl();
    }

    @Scheduled(cron = "0 * * * * *")
    public void getBoardDetails() {
        log.info("Into getBoardDetails scheduler" + new Date());
        HttpEntity request = new HttpEntity(Utilities.setBasicAuthorizationHeaders());
        ResponseEntity<Board> response = restTemplate.exchange("https://c7h7.atlassian.net/rest/agile/1.0/board", HttpMethod.GET, request, Board.class);
        Board board = response.getBody();
        List<Integer> sprintIds = getSprintIds(board);
        System.out.println(sprintIds);
        List<Sprint> sprints = getSprintDetails(sprintIds);
        prepareScrumMetricsDetails(board, sprints);
    }

    private List<Integer> getSprintIds(Board board) {
        List<Integer> sprintids = new ArrayList<>();
        for (Value value : board.values)
            sprintids.add(value.id);
        return sprintids;
    }

    private List<Sprint> getSprintDetails(List<Integer> sprintIds) {
        List<Sprint> scrums = new ArrayList<>();
        HttpEntity request = new HttpEntity(Utilities.setBasicAuthorizationHeaders());
        for (int id : sprintIds) {
            ResponseEntity<Sprint> response = restTemplate.exchange("https://c7h7.atlassian.net/rest/agile/1.0/sprint/" + id, HttpMethod.GET, request, Sprint.class);
            scrums.add(response.getBody());
        }
        return scrums;
    }

    private void prepareScrumMetricsDetails(Board board, List<Sprint> sprints) {
        ScrumMetric scrumMetric = new ScrumMetric();
        for (Sprint s : sprints) {
            scrumMetric.setSprintId(s.id);
            scrumMetric.setTeamId(1);
            scrumMetric.setAverageLast6Sprint(1);
            scrumMetric.setVelocity(1);
            scrumMetric.setSaydoRatio(1);
            scrumMetric.setBurndownRatio(1);
            scrumMetric.setStatus("G");
            scrumMetricService.save(scrumMetric);
        }
    }

    private Map<String, Integer> getTeamIdByName(Board board) {
        Map<String, Integer> d = new HashMap<>();
        for (Value value : board.values) {
            ScrumTeam scrumTeam =scrumTeamService.getByName(value.location.projectName);
            d.put(value.location.projectName, scrumTeam.getId());
        }
        return d;
    }
}
