package com.projet.model.dao;

import java.sql.SQLException;
import java.util.List;

import com.projet.model.entity.Voitures;

public interface VoituresDAO {

	public List<Voitures> getAllVoitures();

	public Voitures getVoitures(Integer Id) throws SQLException;

	public boolean addVoitures(Voitures voitures) throws SQLException;

	public boolean updateVoitures(Voitures voitures) throws SQLException;

	public boolean deleteVoitures(Voitures voitures) throws SQLException;
}
