package com.altimetrik.altivisio.model.response;

import com.altimetrik.altivisio.model.ScrumMetric;

import java.util.Date;

public class SprintDeliveryVO {
    private String domain;
    private String domainDescription;
    private String engagementType;
    private Date startDate;
    private Date endDate;
    private String deliveryModel;
    private String stakeholders;
    private String engineeringManager;
    private String scrumMaster;
    private String technology;
    private String teamName;
    private String mbi;
    private String epic;
    private String epicDescription;
    private String userDescription;
    private String milestone;
    private String milestoneStatus;
    private String milestoneRemark;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getDomainDescription() {
        return domainDescription;
    }

    public void setDomainDescription(String domainDescription) {
        this.domainDescription = domainDescription;
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

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getMbi() {
        return mbi;
    }

    public void setMbi(String mbi) {
        this.mbi = mbi;
    }

    public String getEpic() {
        return epic;
    }

    public void setEpic(String epic) {
        this.epic = epic;
    }

    public String getEpicDescription() {
        return epicDescription;
    }

    public void setEpicDescription(String epicDescription) {
        this.epicDescription = epicDescription;
    }

    public String getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription;
    }

    public String getMilestone() {
        return milestone;
    }

    public void setMilestone(String milestone) {
        this.milestone = milestone;
    }

    public String getMilestoneStatus() {
        return milestoneStatus;
    }

    public void setMilestoneStatus(String milestoneStatus) {
        this.milestoneStatus = milestoneStatus;
    }

    public String getMilestoneRemark() {
        return milestoneRemark;
    }

    public void setMilestoneRemark(String milestoneRemark) {
        this.milestoneRemark = milestoneRemark;
    }
}
