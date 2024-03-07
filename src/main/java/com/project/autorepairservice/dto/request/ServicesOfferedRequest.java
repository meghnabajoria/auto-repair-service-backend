package com.project.autorepairservice.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ServicesOfferedRequest {
    private String serviceType;
    private String serviceName;
    private String desc;
    private String imgUrl;
    private Double offerPrice;
    private Double listPrice;
}
