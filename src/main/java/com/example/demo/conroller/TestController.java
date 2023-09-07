package com.example.demo.conroller;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/dev")
    public String dev() {
        return "hello dev";
    }

    @GetMapping("/prod")
    public String prod() {
        return "hello prod";
    }

    @GetMapping("/")
    public String DataSource() {
        return "hello world";
    }
}
