package com.project.autorepairservice.Models;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Builder
@Data
@Document(collection = "serviceModel")
public class ServiceModel {

    @Id
    private String id;
    private String name;
    private String desc;
    private String serviceType;
    private String imgUrl;
    private List<Integer> offeredAtStores;


}
