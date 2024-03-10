package com.project.autorepairservice.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.project.autorepairservice.Models.ServiceModel;
import com.project.autorepairservice.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServiceModelQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private ServiceRepository serviceRepository;

    public List<ServiceModel> serviceModelList(){
        return serviceRepository.findAll();
    }
}
