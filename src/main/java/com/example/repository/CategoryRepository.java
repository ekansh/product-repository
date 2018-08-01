package com.example.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.entity.Category;
import com.example.entity.Store;

@RepositoryRestResource(collectionResourceRel = "category", path = "category")
public interface CategoryRepository extends CrudRepository<Category, Long> {


}
