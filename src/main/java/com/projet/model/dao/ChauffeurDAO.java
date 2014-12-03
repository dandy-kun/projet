package com.projet.model.dao;

import java.util.List;

import com.projet.model.entity.Chauffeur;
import com.projet.model.entity.Client;

public interface ChauffeurDAO {
	public Chauffeur getChauffeur(final Integer id);
	
	public List<Chauffeur> getAllChauffeur();

	public boolean createChauffeur(Chauffeur chauffeur);

	public boolean updateChauffeur(Chauffeur chauffeur);

	public boolean deleteChauffeur(Chauffeur chauffeur);


}
