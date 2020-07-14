package com.example.hello.controller;

import com.example.hello.service.PersonClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author alessiofiore
 */
@RestController
@Slf4j
public class HelloController {

    @Autowired
    private PersonClient client;

    @Value("${instance.instance-id}")
    private String instanceId;

    @GetMapping("/{id}")
    public String hello(@PathVariable("id") Long id) {
        log.info("Operation executed by instance [{}]", instanceId);
        String world = client.getName(id);
        return "Hello " + world + " from instance '" + instanceId + "'";
    }
}

