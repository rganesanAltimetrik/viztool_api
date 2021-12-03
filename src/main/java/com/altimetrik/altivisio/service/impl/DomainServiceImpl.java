package com.altimetrik.altivisio.service.impl;

import com.altimetrik.altivisio.model.Domain;
import com.altimetrik.altivisio.repository.DomainRepository;
import com.altimetrik.altivisio.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomainServiceImpl implements DomainService {

   @Autowired
   DomainRepository domainRepository;

    @Override
    public void save(Domain domain) {
        domainRepository.save(domain);
    }

    @Override
    public Domain get(int id) {
        return domainRepository.getById(id);
    }
}
