package com.project.autorepairservice.dto.response;

import com.project.autorepairservice.Models.ContactDetails;
import com.project.autorepairservice.Models.ServicesOffered;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class StoreResponse {
    private String name;
//    private Address address;
    private ContactDetails contactDetails;
    private String imgUrl;
}
