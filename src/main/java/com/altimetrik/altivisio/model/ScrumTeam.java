package com.altimetrik.altivisio.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class ScrumTeam {

    private int id;
    private String name;
    private String size;
    List<ScrumMetric> scrumMetrics;

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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public List<ScrumMetric> getScrumMetrics() {
        return scrumMetrics;
    }

    public void setScrumMetrics(List<ScrumMetric> scrumMetrics) {
        this.scrumMetrics = scrumMetrics;
    }
}
