package com.example.service2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author alessiofiore
 */
@RestController
@Slf4j
public class ServiceTwoController {

    @Value("${instance.instance-id}")
    private String instanceId;

    @GetMapping
    public String getWorld() {
        log.info("Operation executed by instance [{}]", instanceId);
        return "World";
    }
}
