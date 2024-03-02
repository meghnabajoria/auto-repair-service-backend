package com.project.autorepairservice.controller;

import com.project.autorepairservice.dto.request.ServiceRequest;
import com.project.autorepairservice.dto.response.ServiceResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class serviceController {
    @GetMapping("/test")
    public String test() {
        return "The first api is working";
    }

//    @PostMapping("/addService")
//    public ServiceResponse addService(ServiceRequest service) {
//
//    }
}
