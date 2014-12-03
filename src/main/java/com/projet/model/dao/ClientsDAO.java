package com.projet.model.dao;

import java.util.List;

import com.projet.controller.ClientsController;
import com.projet.model.entity.Clients;

public interface ClientsDAO {

	public List<ClientsController> getAllClient();

	public Clients getClient(Integer Id);

	public boolean addClient(Clients client);

	public boolean updateClient(Clients clients);

	public boolean deleteClient(Clients client);

	public Object getClients(Clients any);

}
