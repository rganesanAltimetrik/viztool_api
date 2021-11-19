package com.altimetrik.altivisio.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ScrumTeam {

    private int id;
    private Domain domain;
    private String name;
    private String size;
}
