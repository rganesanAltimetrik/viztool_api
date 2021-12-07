package com.altimetrik.altivisio.model.response.Jira;

import java.util.Date;

public class Sprint {
    public int id;
    public String self;
    public String state;
    public String name;
    public Date startDate;
    public Date endDate;
    public Date completeDate;
    public int originBoardId;
    public String goal;
}
