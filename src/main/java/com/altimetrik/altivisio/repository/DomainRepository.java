package com.altimetrik.altivisio.repository;

import com.altimetrik.altivisio.model.Domain;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface DomainRepository extends JpaRepository<Domain,Integer> {
}
