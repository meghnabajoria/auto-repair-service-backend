package com.project.autorepairservice.dto.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ServiceResponse {
    private String name;
    private String desc;

}
