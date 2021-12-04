package com.altimetrik.altivisio.service;

import com.altimetrik.altivisio.model.Project;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public interface ProjectService {
    void save(Project project);
    Project get(int projectId);
    Project getByProjectIdSprintId(int projectId, int sprintId);

}
