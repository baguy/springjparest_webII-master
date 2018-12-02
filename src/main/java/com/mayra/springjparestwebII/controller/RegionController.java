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

import com.mayra.springjparestwebII.dao.RegionDAO;
import com.mayra.springjparestwebII.model.Region;

@RestController
@RequestMapping("/company")
public class RegionController {

	@Autowired
	RegionDAO RegionDAO;

	/* to save an Region*/
	@PostMapping("/regions")
	public Region createRegion(@Valid @RequestBody Region rgn) {
		return RegionDAO.save(rgn);
	}

	/*get all Regions*/
	@GetMapping("/regions")
	public List<Region> getAllRegions(){
		return RegionDAO.findAll();
	}

	/*get Region by rgnid*/
	@GetMapping("/regions/{id}")
	public ResponseEntity<Region> getRegionById(@PathVariable(value="id") Long rgnid){

		Region rgn=RegionDAO.findOne(rgnid);

		if(rgn==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(rgn);

	}


	/*update an Region by rgnid*/
	@PutMapping("/regions/{id}")
	public ResponseEntity<Region> updateRegion(@PathVariable(value="id") Long rgnid,@Valid @RequestBody Region rgnDetails){

		Region rgn=RegionDAO.findOne(rgnid);
		if(rgn==null) {
			return ResponseEntity.notFound().build();
		}

		rgn.setName(rgnDetails.getName());
//		rgn.setBeans(rgnDetails.getBeans());

		Region updateRegion=RegionDAO.save(rgn);
		return ResponseEntity.ok().body(updateRegion);

	}

	/*Delete an Region*/
	@DeleteMapping("/regions/{id}")
	public ResponseEntity<Region> deleteRegion(@PathVariable(value="id") Long rgnid){

		Region rgn=RegionDAO.findOne(rgnid);
		if(rgn==null) {
			return ResponseEntity.notFound().build();
		}
		RegionDAO.delete(rgn);

		return ResponseEntity.ok().build();

	}
}
