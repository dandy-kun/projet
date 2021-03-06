package com.projet.model.dao;

import java.util.List;

import com.projet.model.entity.Chauffeur;

public interface ChauffeurDAO {
	public Chauffeur getChauffeur(final Integer id);

	public List<Chauffeur> getAllChauffeur();

	public boolean addChauffeur(Chauffeur chauffeur);

	public boolean updateChauffeur(Chauffeur chauffeur);

	public boolean deleteChauffeur(Chauffeur chauffeur);
}
