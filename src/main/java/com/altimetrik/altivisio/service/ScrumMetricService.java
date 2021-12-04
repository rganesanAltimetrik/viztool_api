package com.altimetrik.altivisio.service;

import com.altimetrik.altivisio.model.ScrumMetric;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ScrumMetricService {
    void save(ScrumMetric scrumMetric);

    List<ScrumMetric> getByScrumIdTeamId(int scrumId, int teamId);
}
