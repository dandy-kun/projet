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
	public Boolean addVoiture(final Voiture voitures) {
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
		chauffeurDao.addChauffeur(chauffeur);
		return true;
	}

	@Override
	@Transactional(readOnly = false)
	public Boolean addClient(final Client clients) {
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
	public Boolean removeLocation(Integer id) {
		Location location = locationDao.readLocation(id);
		return locationDao.deleteLocation(location);
	}

	@Override
	@Transactional(readOnly = false)
	public Boolean removeClient(Integer id) {
		Client client = clientDao.getClient(id);
		return clientDao.deleteClient(client);
	}

	@Override
	@Transactional(readOnly = false)
	public Client getClient(final Integer clientsId) {
		return clientDao.getClient(clientsId);
	}

	@Override
	@Transactional(readOnly = false)
	public void updateClient(final Client clients) {
		clientDao.updateClient(clients);
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

		return chauffeurDao.getChauffeur(chauffeurId);
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
	public Boolean removeVoiture(Integer id) throws SQLException {
		Voiture voiture = voituresDao.getVoitures(id);
		return voituresDao.deleteVoitures(voiture);
	}

	@Override
	public Voiture getVoiture(Integer id) throws SQLException {

		return voituresDao.getVoitures(id);
	}

	@Override
	public void updateVoiture(Voiture voitures) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional(readOnly = false)
	public List<Location> getLocations() {

		return locationDao.getAllLocation();
	}

	@Override
	public Boolean removeChauffeur(Integer id) {
		Chauffeur chauffeur = chauffeurDao.getChauffeur(id);
		return chauffeurDao.deleteChauffeur(chauffeur);
	}
}
