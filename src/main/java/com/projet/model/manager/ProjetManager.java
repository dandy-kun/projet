package com.projet.model.manager;

import java.util.List;

import com.projet.model.entity.Chauffeur;
import com.projet.model.entity.Clients;
import com.projet.model.entity.Location;
import com.projet.model.entity.Voitures;

public interface ProjetManager {

	public Boolean addVoitures(Voitures voitures);

	public List<Clients> getClients();

	public Boolean addChauffeur(Chauffeur chauffeur);

	public Boolean addClients(Clients clients);

	public Boolean addLocation(Location location);

	public Boolean removeClients(Clients clients);

	public Clients getClient(Integer clientId);

	public List<com.projet.model.entity.Clients> getClients(Integer clientId);

	public void updateClient(Clients clients);

}
