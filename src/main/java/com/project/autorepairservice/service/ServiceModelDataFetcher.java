package com.project.autorepairservice.service;


import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import com.project.autorepairservice.Models.ServiceModel;
import com.project.autorepairservice.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@DgsComponent
public class ServiceModelDataFetcher {
    @Autowired
    private ServiceRepository serviceModelRepository;

    @DgsQuery(field = "services")
    public List<ServiceModel> getServices() {
        return serviceModelRepository.findAll();
    }

    @DgsQuery(field = "service")
    public ServiceModel getServiceById(@InputArgument String id) {
        return serviceModelRepository.findById(Integer.valueOf(id)).orElse(null);
    }
}
