package com.project.autorepairservice.controller;

import com.project.autorepairservice.dto.request.ServiceRequest;
import com.project.autorepairservice.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class serviceController {

    @Autowired
    AutoService autoService;
    @GetMapping("/test")
    public String test() {
        return "The first api is working";
    }
    @PostMapping("/addService")
    public String addService(@RequestBody ServiceRequest service) {
        return autoService.addService(service);
    }
}
