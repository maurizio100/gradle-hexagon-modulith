package com.sonicdevelopment.domain.module1.adapter;

import com.sonicdevelopment.domain.module1.domain.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module1")
public class Module1Adapter {

    @Value( "${greeting}" )
    private String greeting;

    private SomeService someService;

    public Module1Adapter(SomeService someService) {
        this.someService = someService;
    }

    @GetMapping
    public String getModuleString() { return greeting; }
}
