package com.altimetrik.altivisio.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class Domain {
    private int id;
    private Project project;
    private String description;
    private String engagementType;
    private Date startDate;
    private Date endDate;
    private String deliveryModel;
    private String stakeholders;
    private String engineeringManager;
    private String scrumMaster;
    private String technology;

}
