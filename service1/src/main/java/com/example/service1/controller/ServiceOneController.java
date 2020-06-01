package com.example.service1.controller;

import com.example.service1.service.ServiceTwoClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author alessiofiore
 */
@RestController
@Slf4j
public class ServiceOneController {

    @Autowired
    private ServiceTwoClient client;

    @Value("${instance.instance-id}")
    private String instanceId;

    @GetMapping
    public String hello() {
        log.info("Operation executed by instance [{}]", instanceId);
        String world = client.getWorld();
        return "Hello " + world + " from instance '" + instanceId + "'";
    }
}

