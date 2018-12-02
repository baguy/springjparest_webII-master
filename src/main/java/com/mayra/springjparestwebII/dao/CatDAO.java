package com.mayra.springjparestwebII.dao;

/**
 *
 * @author Mayra1600036
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayra.springjparestwebII.model.Cat;
import com.mayra.springjparestwebII.repository.CatRepository;

@Service
public class CatDAO {
    
    	@Autowired
	CatRepository catRepository;
	
	/*to save an cat*/
	public Cat save(Cat cat) {
		return catRepository.save(cat);
	}
	
	
	/* search all cats*/
	public List<Cat> findAll(){
		return catRepository.findAll();
	}
	
	
	/*get an cat by id*/
	public Cat findOne(Long catid) {
		return catRepository.findOne(catid);
	}
	
	
	/*delete an cat*/
	public void delete(Cat cat) {
		catRepository.delete(cat);
	}
	
    
}
