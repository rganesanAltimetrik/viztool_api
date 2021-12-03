package com.altimetrik.altivisio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "project")
public class Project implements Serializable {

    @Id
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "engineering_leader")
    private String leader;


    @OneToMany(mappedBy = "project")
    List<Domain> domains;

    public Project() {
    }

    public Project(String name, String leader) {
        this.name = name;
        this.leader = leader;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public List<Domain> getDomains() {
        return domains;
    }

    public void setDomains(List<Domain> domains) {
        this.domains = domains;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", leader='" + leader + '\'' +
                ", domains=" + domains +
                '}';
    }

}
