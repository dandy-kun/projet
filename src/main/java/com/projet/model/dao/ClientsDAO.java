package com.projet.model.dao;

import java.util.List;

import com.projet.controller.Clients;

public interface ClientsDAO {

	public List<Clients> getAllClient();

	public Clients getClient(Integer Id);

	public boolean addClient(Clients client);

	public boolean updateClient(Clients client);

	public boolean deleteClient(Clients client);
}
