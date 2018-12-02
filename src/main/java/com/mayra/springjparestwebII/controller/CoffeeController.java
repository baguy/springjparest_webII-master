package com.mayra.springjparestwebII.controller;

/**
 *
 * @author Mayra1600036
 */

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mayra.springjparestwebII.dao.CoffeeDAO;
import com.mayra.springjparestwebII.model.Coffee;

@RestController
@RequestMapping("/company")
public class CoffeeController {
    
    	@Autowired
	CoffeeDAO coffeeDAO;
	
	/* to save an coffee*/
	@PostMapping("/coffees")
	public Coffee createEmployee(@Valid @RequestBody Coffee cff) {
		return coffeeDAO.save(cff);
	}
	
	/*get all coffee*/
	@GetMapping("/coffees")
	public List<Coffee> getAllCoffee(){
		return coffeeDAO.findAll();
	}
	
	/*get employee by cffid*/
	@GetMapping("/coffees/{id}")
	public ResponseEntity<Coffee> getEmployeeById(@PathVariable(value="id") Long cffid){
		
		Coffee cff=coffeeDAO.findOne(cffid);
		
		if(cff==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(cff);
		
	}
	
	
	/*update an coffee by id*/
	@PutMapping("/coffees/{id}")
	public ResponseEntity<Coffee> updateEmployee(@PathVariable(value="id") Long cffid,@Valid @RequestBody Coffee cffDetails){
		
		Coffee cff=coffeeDAO.findOne(cffid);
		if(cff==null) {
			return ResponseEntity.notFound().build();
		}
		
		cff.setName(cffDetails.getName());
		cff.setBean(cffDetails.getBean());
		cff.setPrice(cffDetails.getPrice());
		
		Coffee updateCoffee=coffeeDAO.save(cff);
		return ResponseEntity.ok().body(updateCoffee);
		
	}
	
	/*Delete an coffee*/
	@DeleteMapping("/coffees/{id}")
	public ResponseEntity<Coffee> deleteCoffee(@PathVariable(value="id") Long cffid){
		
		Coffee cff=coffeeDAO.findOne(cffid);
		if(cff==null) {
			return ResponseEntity.notFound().build();
		}
		coffeeDAO.delete(cff);
		
		return ResponseEntity.ok().build();
		
	}

}
