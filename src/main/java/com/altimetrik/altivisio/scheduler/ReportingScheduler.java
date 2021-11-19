package com.altimetrik.altivisio.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class ReportingScheduler {

    Logger log = LoggerFactory.getLogger(ReportingScheduler.class);

    //Cron Expression runs on every Friday and 1'O clock and 14 minutes
    @Scheduled(cron = "0 0/14 13 * * FRI")
    private void generate(){
        log.info("Into Logger scheduler"+new Date());
    }
}
