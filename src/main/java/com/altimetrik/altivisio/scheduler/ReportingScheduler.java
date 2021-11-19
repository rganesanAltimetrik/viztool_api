package com.altimetrik.altivisio.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Date;


@Component
public class ReportingScheduler {

    Logger log = LoggerFactory.getLogger(ReportingScheduler.class);

    @Autowired
    private RestTemplate restTemplate;

    //Cron Expression runs on every Friday and 1'O clock and 14 minutes
    @Scheduled(cron = "0 0/47 19 * * FRI")
    private void generate(){
        log.info("Into Logger scheduler"+new Date());
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        log.info(restTemplate.exchange("https://gorest.co.in/public/v1/users", HttpMethod.GET, entity, String.class).getBody());
    }
}
