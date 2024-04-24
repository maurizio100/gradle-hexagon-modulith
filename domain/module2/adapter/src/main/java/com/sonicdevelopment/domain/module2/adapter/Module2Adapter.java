package com.sonicdevelopment.domain.module2.adapter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module2")
public class Module2Adapter {

    @GetMapping
    public String getModuleString() { return "Module2"; }
}
