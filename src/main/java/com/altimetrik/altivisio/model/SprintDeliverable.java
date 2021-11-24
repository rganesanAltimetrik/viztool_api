package com.altimetrik.altivisio.model;

import lombok.Getter;
import lombok.Setter;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ScrumMetric getScrumMetric() {
        return scrumMetric;
    }

    public void setScrumMetric(ScrumMetric scrumMetric) {
        this.scrumMetric = scrumMetric;
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
