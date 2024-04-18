package com.bandiClasses.DMS.repository;

import java.util.List;


/**
 * @author Shiva Ram Reddy Marthala S565585

 */

import org.springframework.data.repository.CrudRepository;

import com.bandiClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	
	List<Dog> findByName(String name);
	

}
