package com.project.autorepairservice.repository;

import com.project.autorepairservice.Models.Store;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends MongoRepository<Store, String> {

}
