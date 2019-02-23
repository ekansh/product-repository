package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.entity.Product;
@CrossOrigin(origins = "*")
//@RepositoryRestResource(collectionResourceRel = "store", path = "store")
public interface ProductRepository extends CrudRepository<Product, Long> {

	 @Query("Select p from Product p where p.name like %:name%")
     List<Product> findByNameContaining(@Param("name") String name);
}
 