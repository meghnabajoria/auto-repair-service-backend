package com.project.autorepairservice.service;

import com.project.autorepairservice.Models.StoreModel;
import com.project.autorepairservice.dto.request.StoreRequest;
import com.project.autorepairservice.dto.response.StoreResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StoreService {
    String addStore(StoreRequest request);
    StoreResponse findStoreByID(String id);
    List<StoreModel> findAll();


}
