package com.altimetrik.altivisio.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "scrummetrics")
public class ScrumMetric {

    @Id
    private int id;

    @Column(name = "Team_id")
    private int teamId;

    @Column(name = "Average_last_6_sprints")
    private int averageLast6Sprint;

    @Column(name = "Sprint_name")
    private String sprintName;

    @Column(name = "Velocity")
    private int velocity;

    @Column(name = "Say_do_ratio")
    private int saydoRatio;

    @Column(name = "Burn_down_ratio")
    private int burndownRatio;

    @Column(name = "Status")
    private String status;

    @Transient
    private List<ScrumDeliverable> scrumDeliverable;

    public ScrumMetric() {
    }

    public ScrumMetric(int teamId,
                       int averageLast6Sprint,
                       String sprintName,
                       int velocity,
                       int saydoRatio,
                       int burndownRatio,
                       String status) {
        this.teamId =  teamId;
        this.averageLast6Sprint = averageLast6Sprint;
        this.sprintName = sprintName;
        this.velocity = velocity;
        this.saydoRatio = saydoRatio;
        this.burndownRatio = burndownRatio;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public int getAverageLast6Sprint() {
        return averageLast6Sprint;
    }

    public void setAverageLast6Sprint(int averageLast6Sprint) {
        this.averageLast6Sprint = averageLast6Sprint;
    }

    public String getSprintName() {
        return sprintName;
    }

    public void setSprintName(String sprintName) {
        this.sprintName = sprintName;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getSaydoRatio() {
        return saydoRatio;
    }

    public void setSaydoRatio(int saydoRatio) {
        this.saydoRatio = saydoRatio;
    }

    public int getBurndownRatio() {
        return burndownRatio;
    }

    public void setBurndownRatio(int burndownRatio) {
        this.burndownRatio = burndownRatio;
    }

    public String getSprintStatus() {
        return status;
    }

    public void setSprintStatus(String sprintStatus) {
        this.status = status;
    }

    public List<ScrumDeliverable> getSprintDeliverable() {
        return scrumDeliverable;
    }

    public void setSprintDeliverable(List<ScrumDeliverable> scrumDeliverable) { this.scrumDeliverable = scrumDeliverable; }
}
