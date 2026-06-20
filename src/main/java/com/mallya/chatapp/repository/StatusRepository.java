package com.mallya.chatapp.repository;

import org.springframework.stereotype.Repository;

@Repository
public class StatusRepository{

    public StatusRepository(){
    }

    public String getString(){
        return "Database is reachable";
    }
}