package com.mallya.chatapp.dto;

public class HealthResponse {
    private String health;

    public HealthResponse(String health){
        this.health = health;
    }

    public String getHealth(){
        return health;
    }

}
