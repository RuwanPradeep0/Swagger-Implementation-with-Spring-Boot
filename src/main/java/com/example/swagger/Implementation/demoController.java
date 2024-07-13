package com.example.swagger.Implementation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/")


public class demoController {
    @GetMapping("/demo")
    public String demoResponse(){
        return "swagger Implementation";
    }
}
