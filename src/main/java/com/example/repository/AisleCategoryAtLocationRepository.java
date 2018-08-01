package com.example.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.entity.AisleCategoryAtLocation;
import com.example.entity.AisleCategoryAtLocationPK;
import com.example.entity.Store;

@RepositoryRestResource(collectionResourceRel = "aisleCategoryAtLocationRepository", path = "aisleCategoryAtLocationRepository")
public interface AisleCategoryAtLocationRepository extends CrudRepository<AisleCategoryAtLocation, AisleCategoryAtLocationPK> {


}
