package service;

import java.util.List;
import java.util.Optional;

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
		Optional<Client> client = this.dao.findById(id) ;
		if (client.isPresent())
			return client.get();
		else 
			return null ;  
	}
	
	public void deleteClient(int id) {
		this.dao.deleteById(id);
	}
	
	public void createClient (String name) {
		Client c = new Client (name);
		this.dao.save(c) ;
		
	}
	
	

}
