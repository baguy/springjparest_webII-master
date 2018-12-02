package com.mayra.springjparestwebII.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayra.springjparestwebII.model.Region;
import com.mayra.springjparestwebII.repository.RegionRepository;

@Service
public class RegionDAO {

	@Autowired
	RegionRepository RegionRepository;

	/*to save an Region*/

	public Region save(Region rgn) {
		return RegionRepository.save(rgn);
	}


	/* search all Regions*/

	public List<Region> findAll(){
		return RegionRepository.findAll();
	}


	/*get an Region by id*/
	public Region findOne(Long rgnid) {
		return RegionRepository.findOne(rgnid);
	}


	/*delete an Region*/

	public void delete(Region rgn) {
		RegionRepository.delete(rgn);
	}


}
