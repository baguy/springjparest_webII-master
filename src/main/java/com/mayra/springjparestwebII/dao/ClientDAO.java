package com.mayra.springjparestwebII.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayra.springjparestwebII.model.Client;
import com.mayra.springjparestwebII.repository.ClientRepository;

@Service
public class ClientDAO {

	@Autowired
	ClientRepository clientRepository;

	/*to save an Client*/

	public Client save(Client cl) {
		return clientRepository.save(cl);
	}


	/* search all Client*/

	public List<Client> findAll(){
		return clientRepository.findAll();
	}


	/*get an Client by id*/
	public Client findOne(Long clid) {
		return clientRepository.findOne(clid);
	}


	/*delete an employee*/

	public void delete(Client cl) {
		clientRepository.delete(cl);
	}


}
