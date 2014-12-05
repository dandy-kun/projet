package com.projet.model.manager.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projet.model.dao.ChauffeurDAO;
import com.projet.model.dao.ClientDAO;
import com.projet.model.dao.LocationDAO;
import com.projet.model.dao.VoitureDAO;
import com.projet.model.entity.Chauffeur;
import com.projet.model.entity.Client;
import com.projet.model.entity.Location;
import com.projet.model.entity.Voiture;
import com.projet.model.manager.ProjetManager;

@Service
public class ProjetManagerImpl implements ProjetManager {

	@Autowired
	private ClientDAO clientDao;

	@Autowired
	private VoitureDAO voituresDao;

	@Autowired
	private LocationDAO locationDao;

	@Autowired
	private ChauffeurDAO chauffeurDao;

	public ProjetManagerImpl() {
		super();
	}

	@Override
	@Transactional(readOnly = false)
	public Boolean addVoitures(final Voiture voitures) {
		try {
			voituresDao.addVoitures(voitures);
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	@Transactional(readOnly = false)
	public Boolean addChauffeur(final Chauffeur chauffeur) {
		chauffeurDao.createChauffeur(chauffeur);
		return true;
	}

	@Override
	@Transactional(readOnly = false)
	public Boolean addClients(final Client clients) {
		clientDao.addClient(clients);
		return true;
	}

	@Override
	@Transactional(readOnly = false)
	public Boolean addLocation(final Location location) {
		locationDao.createLocation(location);
		return true;
	}

	@Override
	@Transactional(readOnly = false)
	public Boolean removeLocation(final Location location) {
		locationDao.deleteLocation(location);
		return true;
	}

	@Override
	@Transactional(readOnly = false)
	public Boolean removeClients(final Client client) {
		clientDao.deleteClient(client);
		return true;
	}

	@Override
	@Transactional(readOnly = false)
	public Client getClient(final Integer clientsId) {
		return null;
	}

	@Override
	@Transactional(readOnly = false)
	public void updateClient(final Client clients) {
		clientDao.updateClient(clients);
	}

	public List<Client> getClients(final Integer clientId) {

		return null;
	}

	@Override
	@Transactional(readOnly = false)
	public List<Client> getClients() {
		return clientDao.getAllClient();
	}

	@Override
	@Transactional(readOnly = false)
	public Location getLocation(final Integer clientId) {

		return null;
	}

	@Override
	@Transactional(readOnly = false)
	public Chauffeur getChauffeur(final Integer chauffeurId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(readOnly = false)
	public List<Chauffeur> getChauffeurs() {
		return chauffeurDao.getAllChauffeur();
	}

	@Override
	@Transactional(readOnly = false)
	public void updateChauffeur(final Chauffeur chauffeur) {

	}

	@Override
	@Transactional(readOnly = false)
	public List<Voiture> getVoitures() {
		return voituresDao.getAllVoitures();
	}

	@Override
	@Transactional(readOnly = false)
	public Boolean removeVoitures(Integer id) throws SQLException {
		Voiture voiture = voituresDao.getVoitures(id);
		return voituresDao.deleteVoitures(voiture);
	}
}
