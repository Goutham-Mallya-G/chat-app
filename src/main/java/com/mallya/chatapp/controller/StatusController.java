package com.mallya.chatapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mallya.chatapp.dto.HealthResponse;
import com.mallya.chatapp.dto.StatusResponse;

@RestController
@RequestMapping("/api")
public class StatusController {

    @GetMapping("/status")
    public StatusResponse status() {
        return new StatusResponse("UP", "chat-app" , "1.0.0");
    }

    @GetMapping("/health")
    public HealthResponse health(){
        return new HealthResponse("HEALTHY");
    }
}
