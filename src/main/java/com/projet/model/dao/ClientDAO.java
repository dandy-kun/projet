package com.projet.model.dao;

import java.util.List;

import com.projet.model.entity.Client;

public interface ClientDAO {

	public List<Client> getAllClient();

	public Client getClient(Integer Id);

	public boolean addClient(Client client);

	public boolean updateClient(Client clients);

	public boolean deleteClient(Client client);
}
