package com.mallya.chatapp.configs;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "chat")
public class ChatConfig{
    private String name;
    private int maxUsers;
    private boolean allowedGuests;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMaxUsers() {
        return maxUsers;
    }
    public void setMaxUsers(int maxUsers) {
        this.maxUsers = maxUsers;
    }
    public boolean isAllowedGuests() {
        return allowedGuests;
    }
    public void setAllowedGuests(boolean allowedGuests) {
        this.allowedGuests = allowedGuests;
    }

    
}