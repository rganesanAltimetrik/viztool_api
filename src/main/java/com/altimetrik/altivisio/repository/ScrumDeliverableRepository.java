package com.altimetrik.altivisio.repository;

import com.altimetrik.altivisio.model.Project;
import com.altimetrik.altivisio.model.ScrumDeliverable;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface ScrumDeliverableRepository extends JpaRepository<ScrumDeliverable,Integer> {
}
