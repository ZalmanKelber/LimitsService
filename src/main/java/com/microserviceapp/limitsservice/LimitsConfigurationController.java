package com.microserviceapp.limitsservice;

import com.microserviceapp.limitsservice.beans.LimitConfiguration;
import com.microserviceapp.limitsservice.config.VariableConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    VariableConfiguration variableConfiguration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfig() {
        return new LimitConfiguration(variableConfiguration.getMinimum(),
                variableConfiguration.getMaximum());
    }
}
