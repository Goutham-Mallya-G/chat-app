package com.mallya.chatapp.service;

import org.springframework.stereotype.Service;

import com.mallya.chatapp.repository.StatusRepository;

@Service
public class StatusService{
    private final StatusRepository repository;
    public StatusService(StatusRepository repository){
        this.repository = repository;
    }

    public String getString(){
        return "chat service : " + repository.getString();
    }
}