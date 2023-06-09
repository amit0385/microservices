package com.spring.cloud.microservice.limitsservice.controller;

import com.spring.cloud.microservice.limitsservice.Configuration;
import com.spring.cloud.microservice.limitsservice.bean.LimitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class LimitConfigController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfig getLimitConfig() {
        return new LimitConfig(configuration.getMaximum(), configuration.getMinimum());
    }
}
