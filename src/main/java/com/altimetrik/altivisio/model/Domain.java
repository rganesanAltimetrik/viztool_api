package com.altimetrik.altivisio.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

public class Domain {
    private int id;
    private String description;
    private String engagementType;
    private Date startDate;
    private Date endDate;
    private String deliveryModel;
    private String stakeholders;
    private String engineeringManager;
    private String scrumMaster;
    private String technology;
    private List<ScrumTeam> teams;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEngagementType() {
        return engagementType;
    }

    public void setEngagementType(String engagementType) {
        this.engagementType = engagementType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDeliveryModel() {
        return deliveryModel;
    }

    public void setDeliveryModel(String deliveryModel) {
        this.deliveryModel = deliveryModel;
    }

    public String getStakeholders() {
        return stakeholders;
    }

    public void setStakeholders(String stakeholders) {
        this.stakeholders = stakeholders;
    }

    public String getEngineeringManager() {
        return engineeringManager;
    }

    public void setEngineeringManager(String engineeringManager) {
        this.engineeringManager = engineeringManager;
    }

    public String getScrumMaster() {
        return scrumMaster;
    }

    public void setScrumMaster(String scrumMaster) {
        this.scrumMaster = scrumMaster;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public List<ScrumTeam> getTeams() {
        return teams;
    }

    public void setTeams(List<ScrumTeam> teams) {
        this.teams = teams;
    }
}
