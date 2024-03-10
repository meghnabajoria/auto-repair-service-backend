package com.project.autorepairservice.dto.response;

import com.project.autorepairservice.Models.ContactDetails;
import com.project.autorepairservice.Models.ServicesOffered;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StoreResponse {
    private String id;
    private String name;
//    private Address address;
    private ContactDetails contactDetails;
    private String imgUrl;
    private List<ServicesOffered> servicesOfferedList;
}
