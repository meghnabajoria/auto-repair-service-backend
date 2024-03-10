//package com.project.autorepairservice.controller;
//
//import com.project.autorepairservice.dto.request.ServiceRequest;
//import com.project.autorepairservice.dto.response.ServiceResponse;
//import com.project.autorepairservice.service.AutoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/")
//public class serviceController {
//
//    @Autowired
//    AutoService autoService;
//    @PostMapping("/addService")
//    public String addService(@RequestBody ServiceRequest service) {
//        return autoService.addService(service);
//    }
//
//    @GetMapping("/findall")
//    public List<ServiceResponse> getAll(){
//        return autoService.findAll();
//    }
//}
//
