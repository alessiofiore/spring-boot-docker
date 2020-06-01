package com.example.service1.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author alessiofiore
 */
@FeignClient(name = "service2-ws", url = "${service2_ws.ip}:${service2_ws.port}/")
public interface ServiceTwoClient {

    @GetMapping
    String getWorld();
}
