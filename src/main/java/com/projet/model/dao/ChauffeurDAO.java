package com.projet.model.dao;

import java.util.List;

import com.projet.model.entity.Chauffeur;

public interface ChauffeurDAO {
	public List<Chauffeur> getAllChauffeur();

	public boolean createChauffeur(Chauffeur chauffeur);

	public Chauffeur readChauffeur(Integer id);

	public boolean updateChauffeur(Chauffeur chauffeur);

	public boolean deleteChauffeur(Chauffeur chauffeur);

}
