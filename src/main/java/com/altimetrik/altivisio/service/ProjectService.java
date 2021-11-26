package com.altimetrik.altivisio.service;

import com.altimetrik.altivisio.model.Project;
import org.springframework.stereotype.Service;

@Service
public interface ProjectService {

    void save(Project project);
}
