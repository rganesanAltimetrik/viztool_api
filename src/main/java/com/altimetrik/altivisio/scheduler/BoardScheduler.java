package com.altimetrik.altivisio.scheduler;

import com.altimetrik.altivisio.common.Utilities;
import com.altimetrik.altivisio.model.ScrumMetric;
import com.altimetrik.altivisio.model.response.Jira.Board;
import com.altimetrik.altivisio.service.impl.ScrumMetricServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@Component
public class BoardScheduler {
    Logger log = LoggerFactory.getLogger(ReportingScheduler.class);

    private RestTemplate restTemplate;
    private ScrumMetricServiceImpl scrumMetricService;

    public BoardScheduler() {
        restTemplate = new RestTemplate();
        scrumMetricService = new ScrumMetricServiceImpl();
    }

    @Scheduled(cron = "0 * * * * *")
    public void getBoardDetails() {
        log.info("Into getBoardDetails scheduler" + new Date());
        HttpEntity request = new HttpEntity(Utilities.setBasicAuthorizationHeaders());
        ResponseEntity<Board> response = restTemplate.exchange("https://c7h7.atlassian.net/rest/agile/1.0/board", HttpMethod.GET, request, Board.class);
        Board board = response.getBody();
        ScrumMetric scrumMetric = prepareScrumMetricsDetails(board);
        scrumMetricService.save(scrumMetric);
    }

    private ScrumMetric prepareScrumMetricsDetails(Board board) {
        return new ScrumMetric();
    }
}
