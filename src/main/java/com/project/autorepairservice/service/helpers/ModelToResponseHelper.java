package com.project.autorepairservice.service.helpers;

import com.project.autorepairservice.Models.ContactDetails;
import com.project.autorepairservice.Models.StoreModel;
import com.project.autorepairservice.dto.response.StoreResponse;

public class ModelToResponseHelper {
    public StoreResponse mapStoreModelToStoreResponse(StoreModel storeModel) {
        return StoreResponse.builder()
                .id(storeModel.getId())
                .name(storeModel.getName())
                .imgUrl(storeModel.getImgUrl())
                .contactDetails(mapContactDetails(storeModel.getContactDetails()))
                .build();
    }

    public ContactDetails mapContactDetails(ContactDetails contactDetailsModel) {
        return ContactDetails.builder()
                .ownerNumber(contactDetailsModel.getOwnerNumber())
                .storeNumber(contactDetailsModel.getStoreNumber())
                .build();
    }
}
