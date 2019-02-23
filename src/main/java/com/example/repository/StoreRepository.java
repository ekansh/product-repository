package com.example.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.entity.Store;
@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "store", path = "store")
public interface StoreRepository extends CrudRepository<Store, Long> {


}
