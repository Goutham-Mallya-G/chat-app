package com.mallya.chatapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mallya.chatapp.service.StatusService;

@RestController
@RequestMapping("/api")
public class StatusController {

    private final StatusService service;

    public StatusController(StatusService service) {
        this.service = service;
    }

    @GetMapping("/status")
    public String status(){
        return service.getString();
    }
}
