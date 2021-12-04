package com.altimetrik.altivisio.repository;

import com.altimetrik.altivisio.model.Project;
import com.altimetrik.altivisio.model.ScrumMetric;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//@Repository
public interface ScrumMetricRepository extends JpaRepository<ScrumMetric,Integer> {

    List<ScrumMetric> getScrumMetricBysprintIdAndScrumTeamId(int metricId, int teamId);
}
