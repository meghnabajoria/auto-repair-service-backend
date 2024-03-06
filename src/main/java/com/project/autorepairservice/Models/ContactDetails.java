package com.project.autorepairservice.Models;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ContactDetails {
    private String storeNumber;
    private String ownerNumber;
}
