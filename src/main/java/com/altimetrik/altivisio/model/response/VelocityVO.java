package com.altimetrik.altivisio.model.response;

import com.altimetrik.altivisio.model.ScrumTeam;
import lombok.Getter;
import lombok.Setter;



public class VelocityVO {

    private String teamName;
    private String domainName;
    private int averageLast6Sprint;
    private String sprintName;
    private int saydoRatio;
    private int burndownRatio;
    private String sprintStatus;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
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
}
