package com.altimetrik.altivisio.repository;

import com.altimetrik.altivisio.model.Project;
import com.altimetrik.altivisio.model.ScrumMetric;
import com.altimetrik.altivisio.model.ScrumTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScrumTeamRepository extends JpaRepository<ScrumTeam,Integer> {

    List<ScrumTeam> getScrumTeamByScrumMetricsSprintIdAndDomainProjectId(int sprintId, int projectId);
    ScrumTeam findByName(String name);
}
