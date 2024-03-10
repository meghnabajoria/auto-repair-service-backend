package com.project.autorepairservice.datafetcher;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.project.autorepairservice.Models.ContactDetails;
import com.project.autorepairservice.Models.StoreModel;
import com.project.autorepairservice.dto.response.StoreResponse;
import com.project.autorepairservice.repository.StoreRepository;
import com.project.autorepairservice.service.helpers.ModelToResponseHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@DgsComponent
public class storeDataFetcher {
    @Autowired
    private StoreRepository storeRepository;

    private final ModelToResponseHelper helper = new ModelToResponseHelper();

    @DgsQuery(field = "stores")
    public List<StoreResponse> getStores() {
        List<StoreModel> storeModels = storeRepository.findAll();
        return storeModels.stream()
                .map(helper::mapStoreModelToStoreResponse)
                .collect(Collectors.toList());
    }
}
