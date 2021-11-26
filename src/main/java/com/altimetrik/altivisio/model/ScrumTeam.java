package com.altimetrik.altivisio.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "scrumTeam")
public class ScrumTeam {

    @Id
    private int id;

    @Column(name = "Domain_id")
    private int domainId;

    @Column(name = "Name")
    private String name;

    @Column(name = "Description")
    private String description;

    @Column(name = "Size")
    private int size;

    @Transient
    List<ScrumMetric> scrumMetrics;

    public ScrumTeam() {
    }

    public ScrumTeam(int domainId,
                     String name,
                     String description,
                     int size) {
        this.domainId = domainId;
        this.name = name;
        this.description = description;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDomainId() {
        return domainId;
    }

    public void setDomainId(int domainId) {
        this.domainId = domainId;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<ScrumMetric> getScrumMetrics() {
        return scrumMetrics;
    }

    public void setScrumMetrics(List<ScrumMetric> scrumMetrics) {
        this.scrumMetrics = scrumMetrics;
    }
}
