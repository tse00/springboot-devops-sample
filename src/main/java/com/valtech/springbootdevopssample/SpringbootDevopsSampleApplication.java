package com.valtech.springbootdevopssample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDevopsSampleApplication {

    @GetMapping("/message")
    public String displayMessage() {
        return "Hello valtechies";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDevopsSampleApplication.class, args);
    }
}
