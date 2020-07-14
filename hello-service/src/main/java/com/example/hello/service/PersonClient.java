package com.example.hello.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author alessiofiore
 */
@FeignClient(name = "person-service-ws", url = "${person-service-ws.ip}:${person-service-ws.port}/")
public interface PersonClient {

    @GetMapping
    String getName(Long id);
}
