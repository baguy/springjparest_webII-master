package com.mayra.springjparestwebII.controller;

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

import com.mayra.springjparestwebII.dao.CatDAO;
import com.mayra.springjparestwebII.model.Cat;

@RestController
@RequestMapping("/company")
public class CatController {
	
	@Autowired
	CatDAO catDAO;
	
	/* to save an cat*/
	@PostMapping("/cats")
	public Cat createcCat(@Valid @RequestBody Cat emp) {
		return catDAO.save(emp);
	}
	
	/*get all cat*/
	@GetMapping("/cats")
	public List<Cat> getAllCats(){
		return catDAO.findAll();
	}
	
	/*get cat by empid*/
	@GetMapping("/cats/{id}")
	public ResponseEntity<Cat> getCatById(@PathVariable(value="id") Long empid){
		
		Cat emp=catDAO.findOne(empid);
		
		if(emp==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(emp);
		
	}
	
	
	/*update an cat by empid*/
	@PutMapping("/cats/{id}")
	public ResponseEntity<Cat> updateCat(@PathVariable(value="id") Long empid,@Valid @RequestBody Cat empDetails){
		
		Cat emp=catDAO.findOne(empid);
		if(emp==null) {
			return ResponseEntity.notFound().build();
		}
		
		emp.setName(empDetails.getName());
		emp.setColor(empDetails.getColor());
		emp.setFriendly(empDetails.getFriendly());
		
		Cat updateCat=catDAO.save(emp);
		return ResponseEntity.ok().body(updateCat);
		
		
		
	}
	
	/*Delete an cat*/
	@DeleteMapping("/cats/{id}")
	public ResponseEntity<Cat> deleteCat(@PathVariable(value="id") Long empid){
		
		Cat emp=catDAO.findOne(empid);
		if(emp==null) {
			return ResponseEntity.notFound().build();
		}
		catDAO.delete(emp);
		
		return ResponseEntity.ok().build();
		
		
	}
	
	

}
