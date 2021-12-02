package com.altimetrik.altivisio.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "scrumdelivarables")
public class ScrumDeliverable {

    @Id
    private int id;

    @Column(name = "ScrumMetricsId")
    private int scrumMetricId;

    @Column(name = "Metric_ID")
    private int metricId;

    @Column(name = "MBI")
    private String mbi;

    @Column(name = "EPI")
    private String epic;

    @Column(name = "EPI_Description")
    private String epicDescription;

    @Column(name = "User_Description")
    private String userDescription;

    @Column(name = "Milestone")
    private String milestone;

    @Column(name = "Milestone_Status")
    private String milestoneStatus;

    @Column(name = "Milestone_Remark")
    private String milestoneRemark;

    @Column(name = "Status")
    private String status;

    public ScrumDeliverable() {
    }

    public ScrumDeliverable(int scrumMetricId,
                            int metricId,
                            String mbi,
                            String epic,
                            String epicDescription,
                            String userDescription,
                            String milestone,
                            String milestoneStatus,
                            String milestoneRemark,
                            String status) {
        this.scrumMetricId = scrumMetricId;
        this.metricId = metricId;
        this.mbi = mbi;
        this.epic = epic;
        this.epicDescription = epicDescription;
        this.userDescription = userDescription;
        this.milestone = milestone;
        this.milestoneStatus = milestoneStatus;
        this.milestoneRemark = milestoneRemark;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScrumMetric() {
        return scrumMetricId;
    }

    public void setScrumMetric(int scrumMetricId) {
        this.scrumMetricId = scrumMetricId;
    }

    public int getMetricId() {
        return metricId;
    }

    public void setMetricId(int metricId) {
        this.metricId = metricId;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) { this.status = status; }
}
