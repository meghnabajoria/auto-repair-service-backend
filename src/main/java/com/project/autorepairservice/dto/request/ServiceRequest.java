package com.project.autorepairservice.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServiceRequest {
    private String name;
    private String desc;
    private String serviceType;
    private String imgUrl;
    private List<Integer> offeredAtStores;
}
