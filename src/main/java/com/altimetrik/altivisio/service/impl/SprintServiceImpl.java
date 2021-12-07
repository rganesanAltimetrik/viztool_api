package com.altimetrik.altivisio.service.impl;

import com.altimetrik.altivisio.model.Sprint;
import com.altimetrik.altivisio.repository.SprintRepository;
import com.altimetrik.altivisio.service.SprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SprintServiceImpl implements SprintService {

    @Autowired
    private SprintRepository sprintRepository;

    @Override
    public List<Sprint> getAll() {
        return sprintRepository.findAll();
    }

//    @Override
//    public Sprint getSprintIdByName(String name) {
//        return sprintRepository.findByName(name);
//    }
}
