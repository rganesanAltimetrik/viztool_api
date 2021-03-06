package com.altimetrik.altivisio.repository;

import com.altimetrik.altivisio.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;


@Repository
public interface ProjectRepository extends JpaRepository<Project,Integer> {
    Project getProjectByIdAndDomainsTeamsScrumMetricsSprintId(int projectId, int sprintId);
}
