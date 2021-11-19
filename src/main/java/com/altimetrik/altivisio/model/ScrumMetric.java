package com.altimetrik.altivisio.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ScrumMetric {

    private int id;
    private ScrumTeam scrumTeam;
    private int averageLast6Sprint;
    private String sprintName;
    private int saydoRatio;
    private int burndownRatio;
    private String sprintStatus;

}
