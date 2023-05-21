package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethod {

    @GetMapping("/orderFallBack")
    public String userServiceFallBackMethod() {
        return "order Service is taking longer than Expected." +
                " Please try again later";
    }

    @GetMapping("/productFallBack")
    public String departmentServiceFallBackMethod() {
        return "product Service is taking longer than Expected." +
                " Please try again later";
    }
}
