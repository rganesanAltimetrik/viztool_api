package com.altimetrik.altivisio.service;

import com.altimetrik.altivisio.model.ScrumDeliverable;
import org.springframework.stereotype.Service;

@Service
public interface ScrumDeliverableService {
    void save(ScrumDeliverable scrumDeliverable);
}
