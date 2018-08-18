package com;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.entity.AisleCategoryAtLocation;
import com.example.entity.AisleCategoryAtLocationPK;
import com.example.entity.AisleProductAtLocation;
import com.example.entity.AisleProductAtLocationPK;
import com.example.repository.AisleCategoryAtLocationRepository;
import com.example.repository.AisleProductAtLocationRepository;

@SpringBootApplication
@EnableJpaRepositories("com.example.repository")
@EntityScan("com.example.entity")
@EnableCaching
public class Application implements CommandLineRunner {
	Logger log = Logger.getLogger(Application.class.getName());
	@Autowired
	private AisleCategoryAtLocationRepository aisleFinderForCategoryRepo;

	@Autowired
	private AisleProductAtLocationRepository aisleFindeForProductrRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		log.info("Executing command line runner");
		AisleCategoryAtLocation findOne = aisleFinderForCategoryRepo.findOne(new AisleCategoryAtLocationPK(5L, 2L));
		log.info("*************************************************************************************************");
		log.info(" Category of  " + findOne.getCategory().getName()+" present at "+
				findOne.getAisleName() + "," +findOne.getDescription()+" at the location "+
				findOne.getLocation().getAddress()+ ","+findOne.getLocation().getStore().getName());
		
		AisleProductAtLocation aisle = aisleFindeForProductrRepo.findOne(new AisleProductAtLocationPK(5L, 1L));
		log.info("*************************************************************************************************");
		log.info(" Product  " + aisle.getProduct().getName()+" present at "+
				aisle.getAisleName() + "," +aisle.getDescription()+" at the location "+
				aisle.getLocation().getAddress()+ ","+aisle.getLocation().getStore().getName());
		log.info("*************************************************************************************************");
		String customMethod = aisleFinderForCategoryRepo.customMethod("loc", "category");
		log.info("Custom method from aisleFinderForCategoryRepo "+ customMethod);
		
		String customMethod2 = aisleFindeForProductrRepo.customMethod("loc", "product");
		log.info("Custom method from aisleFindeForProductrRepo "+ customMethod2);
	}
}
