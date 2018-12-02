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

import com.mayra.springjparestwebII.dao.ClientDAO;
import com.mayra.springjparestwebII.model.Client;

@RestController
@RequestMapping("/company")
public class ClientController {

	@Autowired
	ClientDAO clientDAO;

	/* to save an client*/
	@PostMapping("/clients")
	public Client createClient(@Valid @RequestBody Client emp) {
		return clientDAO.save(emp);
	}

	/*get all clients*/
	@GetMapping("/clients")
	public List<Client> getAllClients(){
		return clientDAO.findAll();
	}

	/*get client by empid*/
	@GetMapping("/clients/{id}")
	public ResponseEntity<Client> getClientById(@PathVariable(value="id") Long empid){

		Client emp=clientDAO.findOne(empid);

		if(emp==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(emp);

	}


	/*update an client by empid*/
	@PutMapping("/clients/{id}")
	public ResponseEntity<Client> updateClient(@PathVariable(value="id") Long empid,@Valid @RequestBody Client empDetails){

		Client emp=clientDAO.findOne(empid);
		if(emp==null) {
			return ResponseEntity.notFound().build();
		}

		emp.setName(empDetails.getName());
		emp.setCoffee(empDetails.getCoffee());
		emp.setCat(empDetails.getCat());

		Client updateClient=clientDAO.save(emp);
		return ResponseEntity.ok().body(updateClient);



	}

	/*Delete an client*/
	@DeleteMapping("/clients/{id}")
	public ResponseEntity<Client> deleteClient(@PathVariable(value="id") Long empid){

		Client emp=clientDAO.findOne(empid);
		if(emp==null) {
			return ResponseEntity.notFound().build();
		}
		clientDAO.delete(emp);

		return ResponseEntity.ok().build();


	}



}
