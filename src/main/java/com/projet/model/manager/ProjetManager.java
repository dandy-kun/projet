package com.projet.model.manager;

import java.sql.SQLException;
import java.util.List;

import com.projet.model.entity.Chauffeur;
import com.projet.model.entity.Client;
import com.projet.model.entity.Location;
import com.projet.model.entity.Voiture;

public interface ProjetManager {

	public Boolean addVoiture(Voiture voitures);

	public List<Voiture> getVoitures();

	public Boolean removeVoiture(Integer id) throws SQLException;

	public Voiture getVoiture(Integer id) throws SQLException;

	public void updateVoiture(Voiture voitures);

	public Boolean addClient(Client clients);

	public Boolean removeClient(Integer id);

	public Client getClient(Integer clientId);

	public void updateClient(Client clients);

	public List<Client> getClients();

	public Boolean addLocation(Location location);

	public Location getLocation(Integer clientId);

	public List<Location> getLocations();

	public Boolean removeLocation(Integer id);

	public Boolean addChauffeur(Chauffeur chauffeur);

	public Chauffeur getChauffeur(Integer chauffeurId);

	public List<Chauffeur> getChauffeurs();

	public void updateChauffeur(Chauffeur chauffeur);

	public Boolean removeChauffeur(Integer id);

}
