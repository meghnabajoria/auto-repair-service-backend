package com.project.autorepairservice.controller;

import com.project.autorepairservice.Models.StoreModel;
import com.project.autorepairservice.dto.request.StoreRequest;
import com.project.autorepairservice.dto.response.StoreResponse;
import com.project.autorepairservice.repository.StoreRepository;
import com.project.autorepairservice.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/store")
public class storeController {

    @Autowired
    StoreService storeService;

    @GetMapping("/test2")
    public String test() {
        return "The second api is working";
    }
    @PostMapping("/addService")
    String addStore(@RequestBody StoreRequest storeRequest){
        return storeService.addStore(storeRequest);
    }

    @GetMapping("/{id}")
    StoreResponse findStoreByID(@PathVariable String id){
        return storeService.findStoreByID(id);
    }
    @GetMapping("/findall")
     List<StoreModel> findAll(){
        return  storeService.findAll();
    }

}
