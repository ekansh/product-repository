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

import com.example.entity.Location;
import com.example.entity.Store;
import com.example.repository.StoreRepository;
import com.example.vo.StoreLocationVO;
import com.example.vo.StoreVO;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class StoreLocatorController {
	@Autowired
	private StoreRepository storeRepo;

	@RequestMapping(value = "stores", method = RequestMethod.GET)
	public HttpEntity<Collection<StoreVO>> stores() {
		Iterable<Store> findAll = storeRepo.findAll();

		Collection<StoreVO> target = new ArrayList<>();
		for (Store store : findAll) {
			StoreVO e = new StoreVO();
			e.setName(store.getName());
			e.setStoreid(store.getStoreid());
			target.add(e);
		}
		return new ResponseEntity<>(target, HttpStatus.OK);
	}
	
	@RequestMapping(value = "storeslocation/{id}", method = RequestMethod.GET)
	public HttpEntity<Collection<StoreLocationVO>> storeslocation(@PathVariable("id") Integer id) {
		System.out.println("param "+id);
		Store store = storeRepo.findOne(new Long(id));
		System.out.println(store);
		List<Location> locations = store.getLocations();
		System.out.println(locations);
		Collection<StoreLocationVO> target = new ArrayList<>();
		for (Location location : locations) {
			StoreLocationVO e = new StoreLocationVO();
			e.setLocationAddress(location.getAddress());
			e.setLocationid(location.getLocationid());
			e.setLocationName(null);
			target.add(e);
		}
		return new ResponseEntity<>(target, HttpStatus.OK);
	}
}
