package com.project.autorepairservice.Models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ServicesOffered {
    private String serviceId;
    private String serviceName;
    private String desc;
    private String imgUrl;
    private Double offerPrice;
    private Double listPrice;
}
