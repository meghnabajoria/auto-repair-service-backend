package com.project.autorepairservice.service;

import com.project.autorepairservice.Models.ServicesOffered;
import com.project.autorepairservice.Models.StoreModel;
import com.project.autorepairservice.dto.request.ServicesOfferedRequest;
import com.project.autorepairservice.dto.request.StoreRequest;
import com.project.autorepairservice.dto.response.StoreResponse;
import com.project.autorepairservice.repository.StoreRepository;
import com.project.autorepairservice.service.helpers.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    StoreRepository storeRepository;
    @Override
    public String addStore(StoreRequest request){
        if (request.getName() == null ||
                request.getName().isEmpty() ||
                request.getContactDetails().getStoreNumber() == null) {
            throw new ServiceException("Store name, address and contact cannot be null");
        }
        //Todo add logic for populative service id while adding a store


        StoreModel storeModel = com.project.autorepairservice.Models.StoreModel
                .builder()
                .name(request.getName())
                .contactDetails(request.getContactDetails())
                .imgUrl(request.getImgUrl())
                .servicesOfferedList(convertToServiceOffered(request.getServicesOfferedList()))
                .build();

        StoreModel model = storeRepository.insert(storeModel);
        return model.getId();
    }

    private List<ServicesOffered> convertToServiceOffered(List<ServicesOfferedRequest> requests) {
        List<ServicesOffered> list = new ArrayList<>();
        for (ServicesOfferedRequest r:requests){
            ServicesOffered offered = ServicesOffered.builder()
                    .serviceName(r.getServiceName())
                    .serviceType(r.getServiceType())
                    .desc(r.getDesc())
                    .imgUrl(r.getImgUrl())
                    .listPrice(r.getListPrice())
                    .offerPrice(r.getOfferPrice())
                    .build();
            list.add(offered);
        }
        return list;
    }


    @Override
    public StoreResponse findStoreByID(String id) {
        Optional<StoreModel> storeOptional = storeRepository.findById(id);
        return storeOptional.map(this::convertToStoreResponse).orElse(null);
    }


    @Override
    public List<StoreModel> findAll() {
        return storeRepository.findAll();
    }

    private StoreResponse convertToStoreResponse(StoreModel storeModel) {
        return StoreResponse.builder()
                .name(storeModel.getName())
                .contactDetails(storeModel.getContactDetails())
                .imgUrl(storeModel.getImgUrl())
                .build();
    }
}
