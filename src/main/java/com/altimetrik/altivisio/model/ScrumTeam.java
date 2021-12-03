package com.altimetrik.altivisio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "scrumteams")
public class ScrumTeam implements Serializable {

    @Id
    private int id;

    //@Column(name = "Domain_id")
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Domain_id", nullable = false)
    private Domain domain;

    @Column(name = "Name")
    private String name;

    @Column(name = "Description")
    private String description;

    @Column(name = "Size")
    private int size;

    @OneToMany(mappedBy = "scrumTeam")
    List<ScrumMetric> scrumMetrics;


    public ScrumTeam() {
    }

    public ScrumTeam(int domainId,
                     String name,
                     String description,
                     int size) {
        this.domain.setId(domainId);
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

    public Domain getDomain() {
        return domain;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
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
