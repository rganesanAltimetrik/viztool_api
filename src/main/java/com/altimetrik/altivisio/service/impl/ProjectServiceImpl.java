package com.altimetrik.altivisio.service.impl;

import com.altimetrik.altivisio.model.Project;
import com.altimetrik.altivisio.repository.ProjectRepository;
import com.altimetrik.altivisio.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

   @Autowired
   ProjectRepository projectRepository;

    @Override
    public void save(Project project) {
        projectRepository.save(project);
    }
}
