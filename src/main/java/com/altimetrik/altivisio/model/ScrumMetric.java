package com.altimetrik.altivisio.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class ScrumMetric {

    private int id;
    //private ScrumTeam scrumTeam;
    private int averageLast6Sprint;
    private String sprintName;
    private int saydoRatio;
    private int burndownRatio;
    private String sprintStatus;
    private List<SprintDeliverable> sprintDeliverable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return sprintStatus;
    }

    public void setSprintStatus(String sprintStatus) {
        this.sprintStatus = sprintStatus;
    }

    public List<SprintDeliverable> getSprintDeliverable() {
        return sprintDeliverable;
    }

    public void setSprintDeliverable(List<SprintDeliverable> sprintDeliverable) {
        this.sprintDeliverable = sprintDeliverable;
    }
}
