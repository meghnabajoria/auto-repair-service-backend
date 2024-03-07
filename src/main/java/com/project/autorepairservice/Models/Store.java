package com.project.autorepairservice.Models;


import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@Document(collection = "store")
public class Store {
    @Id
    private String id;
    private String name;
//    private Address address;
    private ContactDetails contactDetails;
    private String imgUrl;
    private List<ServicesOffered> servicesOfferedList;
}
