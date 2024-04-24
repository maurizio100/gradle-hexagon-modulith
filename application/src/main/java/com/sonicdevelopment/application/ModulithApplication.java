package com.sonicdevelopment.application;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import static org.springframework.boot.SpringApplication.run;


@SpringBootApplication(
        scanBasePackages = {
                "com.sonicdevelopment.domain.module1",
                "com.sonicdevelopment.domain.module2",
        }
)
public class ModulithApplication {
    public static void main(final String... args) {
        run(ModulithApplication.class, args);
    }
}
