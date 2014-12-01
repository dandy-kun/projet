package com.projet.model.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.model.dao.ChauffeurDAO;
import com.projet.model.dao.ClientsDAO;
import com.projet.model.dao.LocationDAO;
import com.projet.model.dao.VoituresDAO;
import com.projet.model.entity.Chauffeur;
import com.projet.model.entity.Clients;
import com.projet.model.entity.Location;
import com.projet.model.entity.Voitures;
import com.projet.model.manager.ProjetManager;

@Service
public class ProjetManagerImpl implements ProjetManager {

	@Autowired
	private ClientsDAO clientDao;

	@Autowired
	private VoituresDAO voituresDao;

	@Autowired
	private LocationDAO locationDao;

	@Autowired
	private ChauffeurDAO chauffeurDao;

	public ProjetManagerImpl() {
		super();
	}

	public Boolean addVoitures(final Voitures voitures) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Clients> getClients() {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean addChauffeur(final Chauffeur chauffeur) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean addClients(final Clients clients) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean addLocation(final Location location) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean removeClients(final Clients clients) {
		// TODO Auto-generated method stub
		return null;
	}

	public Clients getClient(final Integer clientId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Clients> getClients(final Integer clientId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateClient(final Clients clients) {
		// TODO Auto-generated method stub

	}

}
