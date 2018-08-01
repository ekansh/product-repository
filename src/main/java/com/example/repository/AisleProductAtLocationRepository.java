package com.example.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.entity.AisleProductAtLocation;
import com.example.entity.AisleProductAtLocationPK;

@RepositoryRestResource(collectionResourceRel = "aisleProductAtLocationRepository", path = "aisleProductAtLocationRepository")
public interface AisleProductAtLocationRepository extends CrudRepository<AisleProductAtLocation, AisleProductAtLocationPK> {


}
