package com.projet.model.dao;

import java.sql.SQLException;
import java.util.List;

import com.projet.model.entity.Voiture;

public interface VoitureDAO {

	public List<Voiture> getAllVoitures();

	public Voiture getVoitures(Integer Id) throws SQLException;

	public boolean addVoitures(Voiture voitures) throws SQLException;

	public boolean updateVoitures(Voiture voitures) throws SQLException;

	public boolean deleteVoitures(Voiture voitures) throws SQLException;
}
