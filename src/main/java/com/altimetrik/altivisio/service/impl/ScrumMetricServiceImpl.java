package com.altimetrik.altivisio.service.impl;

import com.altimetrik.altivisio.model.ScrumMetric;
import com.altimetrik.altivisio.repository.ScrumMetricRepository;
import com.altimetrik.altivisio.service.ScrumMetricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScrumMetricServiceImpl implements ScrumMetricService {

   @Autowired
   ScrumMetricRepository scrumMetricRepository;

    @Override
    public void save(ScrumMetric scrumMetric) {
        scrumMetricRepository.save(scrumMetric);
    }

    @Override
    public List<ScrumMetric> getByScrumIdTeamId(int scrumId, int teamId) {
        return scrumMetricRepository.getScrumMetricBysprintIdAndScrumTeamId(scrumId, teamId);
    }
}
