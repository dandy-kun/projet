package com.projet.model.dao;

import java.util.List;

import com.projet.model.entity.Location;

public interface LocationDAO {
	public List<Location> getAllLocation();

	public boolean createLocation(Location location);

	public Location readLocation(Integer id);

	public boolean updateLocation(Location location);

	public boolean deleteLocation(Location location);
}
