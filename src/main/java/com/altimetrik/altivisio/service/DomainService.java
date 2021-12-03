package com.altimetrik.altivisio.service;

import com.altimetrik.altivisio.model.Domain;
import org.springframework.stereotype.Service;

@Service
public interface DomainService {
    void save(Domain domain);
    Domain get(int id);
}
