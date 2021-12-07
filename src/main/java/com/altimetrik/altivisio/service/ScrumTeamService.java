package com.altimetrik.altivisio.service;

import com.altimetrik.altivisio.model.ScrumTeam;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ScrumTeamService {
    void save(ScrumTeam scrumTeam);

    List<ScrumTeam> getByProjectIdSprintId(int projectId, int SprintId);

    ScrumTeam getByName(String name);
}
