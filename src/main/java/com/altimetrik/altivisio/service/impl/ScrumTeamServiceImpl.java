package com.altimetrik.altivisio.service.impl;

import com.altimetrik.altivisio.model.ScrumTeam;
import com.altimetrik.altivisio.repository.ScrumTeamRepository;
import com.altimetrik.altivisio.service.ScrumTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScrumTeamServiceImpl implements ScrumTeamService {

   @Autowired
   ScrumTeamRepository scrumTeamRepository;

    @Override
    public void save(ScrumTeam scrumTeam) {
        scrumTeamRepository.save(scrumTeam);
    }

    @Override
    public List<ScrumTeam> getByProjectIdSprintId(int projectId, int SprintId) {
        return scrumTeamRepository.getScrumTeamByScrumMetricsSprintIdAndDomainProjectId(SprintId, projectId);
    }
}
