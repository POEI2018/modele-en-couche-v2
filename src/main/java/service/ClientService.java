package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.ClientDao;
import model.Client;

public class ClientService {
	
	@Autowired
	private ClientDao dao ; 
	
	public void saveClient(Client client) {
		this.dao.save(client) ;
	}
	
	public List<Client> getAllClient() {
		return this.dao.findAll() ; 	
	}
	
	public Client getValidatedClient(int id) {
		return this.dao.getOne(id); 
	}
	
	

}
