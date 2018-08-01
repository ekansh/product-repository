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
import com.example.repository.AisleCategoryAtLocationRepository;

@SpringBootApplication
@EnableJpaRepositories("com.example.repository")
@EntityScan("com.example.entity")
@EnableCaching
public class Application implements CommandLineRunner {
	Logger log = Logger.getLogger(Application.class.getName());
	@Autowired
	private AisleCategoryAtLocationRepository aisleFinderRepo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		log.info("Executing command line runner");
		AisleCategoryAtLocation findOne = aisleFinderRepo.findOne(new AisleCategoryAtLocationPK(5L, 2L));
		log.info("Execution of command line runner ends with result : Category of  " + findOne.getCategory().getName()+" present at "+
				findOne.getAisleName() + "," +findOne.getDescription()+" at the location "+
				findOne.getLocation().getAddress()+ ","+findOne.getLocation().getStore().getName());

	}
}
