package com.project.autorepairservice.dto.request;

import com.project.autorepairservice.Models.ContactDetails;
import com.project.autorepairservice.Models.ServicesOffered;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class StoreRequest {
    private String name;
    private ContactDetails contactDetails;
    private String imgUrl;
    private List<ServicesOfferedRequest> servicesOfferedList;
}
