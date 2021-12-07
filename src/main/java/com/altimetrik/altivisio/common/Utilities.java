package com.altimetrik.altivisio.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;

public class Utilities {
//    @Value("${jira.username}")
//    private static String username;
//
//    @Value("${jira.password}")
//    private static String password;

    public static HttpHeaders setBasicAuthorizationHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setBasicAuth("gpalani6799@altimetrik.com", "vMZ3kVjpgInDrko9iIzO4DE2");
        return  headers;
    }
}
