package com.project.autorepairservice.Models;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Builder
@Data
public class ServiceModel {
    @Id
    private String id;
    private String name;
    private String desc;
    private String ServiceType;
    private String imgUrl;
    private List<Integer> offeredAtStores;
}
