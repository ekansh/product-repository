package com.example.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.AisleProductAtLocation;
import com.example.entity.Location;
import com.example.entity.Product;
import com.example.entity.Store;
import com.example.repository.AisleCategoryAtLocationRepository;
import com.example.repository.AisleProductAtLocationRepository;
import com.example.repository.ProductRepository;
import com.example.repository.StoreRepository;
import com.example.vo.AisleInfoVO;
import com.example.vo.StoreLocationVO;
import com.example.vo.StoreVO;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/searchat")
public class AisleLocatorController {
	@Autowired
	private StoreRepository storeRepo;
	@Autowired
	private ProductRepository productRepo;
	@Autowired
	private AisleCategoryAtLocationRepository aisleFinderForCategoryRepo;

	@Autowired
	private AisleProductAtLocationRepository aisleFindeForProductrRepo;

	@RequestMapping(value = "storeslocation/{id}", method = RequestMethod.GET)
	public HttpEntity<Collection<AisleInfoVO>> stores(@PathVariable("id") Integer id,
			@RequestParam(name = "p", defaultValue = "") String product,
			@RequestParam(name = "c", defaultValue = "") String category) {
		System.out.println("id " + id + " p " + product + " c " + category);
		System.out.println("product repo " + aisleFindeForProductrRepo + " category repo " + aisleFinderForCategoryRepo
				+ " store repo " + storeRepo);
		List<Product> findByNameContaining = productRepo.findByNameContaining(product);
		System.out.println("findByNameContaining "+findByNameContaining);
		Collection<AisleInfoVO> target = new ArrayList<>();
		for (Product product2 : findByNameContaining) {
			System.out.println(product2.getName() + "::" + product2.getProductid());
			List<AisleProductAtLocation> productAisle = aisleFindeForProductrRepo.getProductAisle(id.longValue(),
					product2.getProductid().longValue());
			for (AisleProductAtLocation aisleProductAtLocation : productAisle) {
				AisleInfoVO aisleInfoVO = new AisleInfoVO();
				aisleInfoVO.setAisleName(aisleProductAtLocation.getDescription());
				aisleInfoVO.setAisleDescription(aisleProductAtLocation.getDescription());
				aisleInfoVO.setProductDescription(null);
				aisleInfoVO.setProductName(product2.getName());
				target.add(aisleInfoVO);
			}
		}

		return new ResponseEntity<>(target, HttpStatus.OK);
	}

}
