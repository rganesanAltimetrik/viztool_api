package com.altimetrik.altivisio.service;

import com.altimetrik.altivisio.model.ScrumMetric;
import org.springframework.stereotype.Service;

@Service
public interface ScrumMetricService {
    void save(ScrumMetric scrumMetric);
}
