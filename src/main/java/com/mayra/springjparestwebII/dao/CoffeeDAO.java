package com.mayra.springjparestwebII.dao;

/**
 *
 * @author Mayra1600036
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayra.springjparestwebII.model.Coffee;
import com.mayra.springjparestwebII.repository.CoffeeRepository;

@Service
public class CoffeeDAO {
    
    	@Autowired
	CoffeeRepository coffeeRepository;
	
	/*to save an coffee*/
	public Coffee save(Coffee cff) {
		return coffeeRepository.save(cff);
	}

	/* search all coffee*/	
	public List<Coffee> findAll(){
		return coffeeRepository.findAll();
	}
		
	/*get an coffee by id*/
	public Coffee findOne(Long cffid) {
		return coffeeRepository.findOne(cffid);
	}	
	
	/*delete an coffee*/	
	public void delete(Coffee cff) {
		coffeeRepository.delete(cff);
	}
    
}
