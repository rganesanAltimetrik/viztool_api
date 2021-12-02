package com.altimetrik.altivisio.service;

import com.altimetrik.altivisio.model.ScrumTeam;
import org.springframework.stereotype.Service;

@Service
public interface ScrumTeamService {
    void save(ScrumTeam scrumTeam);
}
