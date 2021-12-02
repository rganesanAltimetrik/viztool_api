package com.altimetrik.altivisio.repository.impl;


import com.altimetrik.altivisio.repository.ProjectRepository;
import com.altimetrik.altivisio.utils.DatabaseManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Map;

@Configuration
@PropertySource(value = "classpath:application.properties")

@Repository
public abstract class ProjectRepositoryImpl implements ProjectRepository {

    @Autowired
    private Environment env;

    public Map<String,String> getProjectDetail(int projectId) {
        Assert.notNull(projectId, "The given id must not be null!");
        DatabaseManager dbManager = new DatabaseManager();
        String hostname = env.getProperty("spring.datasource.url");
        String username = env.getProperty("spring.datasource.username");
        String password = env.getProperty("spring.datasource.password");
        String jdbcURL = hostname + "user=" + username + "&password=" + password;
        String query = "SELECT name, engineering_leader FROM c7h7.project where Id = "+projectId;
        Map<String, String>  projectDetails = dbManager.getValueFromDatabaseForDifferentColumns(jdbcURL, query, 2);
        return projectDetails;
    }
}
