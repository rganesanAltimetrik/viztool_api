package com.altimetrik.altivisio.repository;

import com.altimetrik.altivisio.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface ProjectRepository extends JpaRepository<Project,Integer> {
}
