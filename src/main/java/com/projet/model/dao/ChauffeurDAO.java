package com.projet.model.dao;

import java.util.List;

import com.projet.model.entity.Chauffeur;
import com.projet.model.entity.Clients;

public interface ChauffeurDAO {
	public List<Chauffeur> getAllChauffeur();

	public boolean createChauffeur(Chauffeur chauffeur);

	public boolean updateChauffeur(Chauffeur chauffeur);

	public boolean deleteChauffeur(Chauffeur chauffeur);

	public boolean delete(Clients cl);

}
