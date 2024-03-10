package com.project.autorepairservice.dto.request;


import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ServiceRequest {
    private String name;
    private String desc;
    private String ServiceType;
    private String imgUrl;
    private List<Integer> offeredAtStores;
}
