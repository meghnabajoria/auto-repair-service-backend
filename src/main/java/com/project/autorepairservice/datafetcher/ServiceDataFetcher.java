package com.project.autorepairservice.datafetcher;


import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsMutation;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import com.project.autorepairservice.Models.ServiceModel;
import com.project.autorepairservice.dto.request.ServiceRequest;
import com.project.autorepairservice.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@DgsComponent
public class ServiceDataFetcher {
    @Autowired
    private ServiceRepository serviceModelRepository;

    @DgsQuery(field = "services")
    public List<ServiceModel> getServices() {
        return serviceModelRepository.findAll();
    }

    @DgsQuery(field = "service")
    public ServiceModel getServiceById(@InputArgument String id) {
        return serviceModelRepository.findById(id).orElse(null);
    }

    @DgsMutation(field = "addService")
    public ServiceModel addService(@InputArgument ServiceRequest input) {
        // Create a new ServiceModel object from the input
        ServiceModel newService = ServiceModel.builder()
                .name(input.getName())
                .desc(input.getDesc())
                .serviceType(input.getServiceType())
                .imgUrl(input.getImgUrl())
                .offeredAtStores(input.getOfferedAtStores())
                .build();

        // Save the new service to the repository
        return serviceModelRepository.save(newService);
    }
}

