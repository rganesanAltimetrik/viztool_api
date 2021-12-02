package com.altimetrik.altivisio.service.impl;

import com.altimetrik.altivisio.model.ScrumDeliverable;
import com.altimetrik.altivisio.repository.ScrumDeliverableRepository;
import com.altimetrik.altivisio.service.ScrumDeliverableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScrumDeliverableServiceImpl implements ScrumDeliverableService {

   @Autowired
   ScrumDeliverableRepository scrumDeliverableRepository;

    @Override
    public void save(ScrumDeliverable scrumDeliverable) {
        scrumDeliverableRepository.save(scrumDeliverable);
    }
}
