package com.altimetrik.altivisio.service.impl;

import com.altimetrik.altivisio.model.ScrumMetric;
import com.altimetrik.altivisio.repository.ScrumMetricRepository;
import com.altimetrik.altivisio.service.ScrumMetricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
