package com.sonicdevelopment.domain.module1.adapter;

import com.sonicdevelopment.domain.module1.domain.SomeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:foo.properties")
public class AdapterConfiguration {

    @Bean
    public SomeService someService() {
        return new SomeService();
    }
}
