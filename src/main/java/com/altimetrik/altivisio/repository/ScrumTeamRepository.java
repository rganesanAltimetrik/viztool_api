package com.altimetrik.altivisio.repository;

import com.altimetrik.altivisio.model.Project;
import com.altimetrik.altivisio.model.ScrumTeam;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface ScrumTeamRepository extends JpaRepository<ScrumTeam,Integer> {
}
