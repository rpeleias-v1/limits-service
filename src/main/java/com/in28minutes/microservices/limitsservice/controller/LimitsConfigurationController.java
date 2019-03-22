package com.in28minutes.microservices.limitsservice.controller;

import com.in28minutes.microservices.limitsservice.config.LimitConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfigurations() {
        return new LimitConfiguration(1, 1000);
    }
}
