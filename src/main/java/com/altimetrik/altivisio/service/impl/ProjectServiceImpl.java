package com.altimetrik.altivisio.service.impl;

import com.altimetrik.altivisio.model.Project;
import com.altimetrik.altivisio.model.ScrumTeam;
import com.altimetrik.altivisio.repository.ProjectRepository;
import com.altimetrik.altivisio.service.ProjectService;
import com.altimetrik.altivisio.utils.DatabaseManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.core.env.Environment;

import java.util.HashMap;
import java.util.Map;


@Service
public class ProjectServiceImpl implements ProjectService {

   @Autowired
   ProjectRepository projectRepository;

    @Override
    public void save(Project project) {

       // projectRepository.save(project);
        Project project1 = projectRepository.getById(10);
        System.out.println(project1);
    }

    @Override
    public Project get(int projectId) {
        return projectRepository.findById(projectId).get();
    }

    @Override
    public Project getByProjectIdSprintId(int projectId, int sprintId) {
        return projectRepository.getProjectByIdAndDomainsTeamsScrumMetricsSprintId(projectId, sprintId);
    }

    @Override
    public Project getByName(String name) {
        return projectRepository.findByName(name);
    }
}
