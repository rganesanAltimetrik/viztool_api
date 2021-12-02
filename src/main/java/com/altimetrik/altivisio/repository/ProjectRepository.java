package com.altimetrik.altivisio.repository;

import com.altimetrik.altivisio.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;


@Repository
public interface ProjectRepository extends JpaRepository<Project,Integer> {
    Map<String, String> getProjectDetail(int projectId);
}
