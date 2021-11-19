package com.altimetrik.altivisio.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SprintDeliverable {

    private int id;
    private ScrumMetric scrumMetric;
    private String mbi;
    private String epic;
    private String epicDescription;
    private String userDescription;
    private String milestone;
    private String milestoneStatus;
    private String milestoneRemark;
}
