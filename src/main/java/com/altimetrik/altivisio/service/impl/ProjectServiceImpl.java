package com.altimetrik.altivisio.service.impl;

import com.altimetrik.altivisio.model.Project;
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
        projectRepository.save(project);
    }

    @Override
    public Map<String,String> getProjectDetails(int projectId) {
        Map<String, String> projectDetails = projectRepository.getProjectDetail(projectId);
        return projectDetails;
    }
}
