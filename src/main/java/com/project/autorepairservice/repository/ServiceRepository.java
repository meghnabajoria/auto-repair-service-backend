package com.project.autorepairservice.repository;

import com.project.autorepairservice.Models.ServiceModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ServiceRepository extends MongoRepository<ServiceModel, Integer> {

}
