package com.project.autorepairservice.service;

import com.project.autorepairservice.dto.request.ServiceRequest;
import com.project.autorepairservice.dto.response.ServiceResponse;

public interface AutoService {
    String addService(ServiceRequest request);
}
