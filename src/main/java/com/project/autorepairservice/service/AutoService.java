package com.project.autorepairservice.service;

import com.project.autorepairservice.dto.request.ServiceRequest;
import com.project.autorepairservice.dto.response.ServiceResponse;

import java.util.List;

public interface AutoService {
    String addService(ServiceRequest request);

    List<ServiceResponse> findAll();
}
