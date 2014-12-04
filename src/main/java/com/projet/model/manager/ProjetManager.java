package com.projet.model.manager;

import java.util.List;

import com.projet.model.entity.Chauffeur;
import com.projet.model.entity.Client;
import com.projet.model.entity.Location;
import com.projet.model.entity.Voiture;

public interface ProjetManager {

	public Boolean addVoitures(Voiture voitures);

	public List<Voiture> getVoitures();

	public Boolean addChauffeur(Chauffeur chauffeur);

	public Boolean addClients(Client clients);

	public Boolean addLocation(Location location);

	public Boolean removeClients(Client clients);

	public Client getClient(Integer clientId);

	public Location getLocation(Integer clientId);

	public void updateClient(Client clients);

	public List<Client> getClients();

	public Boolean removeLocation(Location location);

	public Chauffeur getChauffeur(Integer chauffeurId);

	public List<Chauffeur> getChauffeurs();

	public void updateChauffeur(Chauffeur chauffeur);
}
