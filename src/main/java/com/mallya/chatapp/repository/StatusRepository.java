package com.mallya.chatapp.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class StatusRepository{

    private String appName;


    public StatusRepository(@Value("${app.name}") String appName){
        this.appName = appName;
    }

    public String getString(){
        return "Database for " + appName +" is reachable";
    }
}