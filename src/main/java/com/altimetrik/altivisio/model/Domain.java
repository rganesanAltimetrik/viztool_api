package com.altimetrik.altivisio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "domains")
public class Domain implements Serializable {

    @Id
    private int id;

    @JsonIgnore
    //@Column(name = "Project_id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;

    @Column(name = "Name")
    private String name;

    @Column(name = "Description")
    private String description;

    @Column(name = "Engagement_type")
    private String engagementType;

    @Column(name = "Start_date")
    private String startDate;

    @Column(name = "End_date")
    private String endDate;

    @Column(name = "Delivery_model")
    private String deliveryModel;

    @Column(name = "Stakeholders")
    private String stakeholders;

    @Column(name = "Engineering_manager")
    private String engineeringManager;

    @Column(name = "Scrum_master")
    private String scrumMaster;

    @Column(name = "Technology")
    private String technology;

    @Column(name = "Status")
    private String status;


    @OneToMany(mappedBy = "domain")
    private List<ScrumTeam> teams;

    public Domain() {
    }

    public Domain(int projectId,
                  String name,
                  String description,
                  String engagementType,
                  String startDate,
                  String endDate,
                  String deliveryModel,
                  String stakeholders,
                  String engineeringManager,
                  String scrumMaster,
                  String technology,
                  String status) {
       // this.projectId = projectId;
        this.name = name;
        this.description = description;
        this.engagementType = engagementType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deliveryModel = deliveryModel;
        this.stakeholders = stakeholders;
        this.engineeringManager = engineeringManager;
        this.scrumMaster = scrumMaster;
        this.technology = technology;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) { this.status = status; }

    public List<ScrumTeam> getTeams() {
        return teams;
    }

    public void setTeams(List<ScrumTeam> teams) {
        this.teams = teams;
    }
}
