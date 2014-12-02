package com.projet.model.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.projet.model.dao.LocationDAO;
import com.projet.model.entity.Clients;
import com.projet.model.entity.Location;

public class LocationDAOImplJPA implements LocationDAO {

	private EntityManager entityManager;

	public List<Location> getAllLocation() {
		final CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		final CriteriaQuery<Location> cq = builder.createQuery(Location.class);
		final Root<Location> root = cq.from(Location.class);
		cq.select(root);
		return entityManager.createQuery(cq).getResultList();
	}

	public boolean createLocation(final Location location) {
		if (location == null) {
			return false;
		}
		entityManager.persist(location);
		return true;
	}

	public boolean updateLocation(final Location location) {
		if (location == null) {
			return false;
		}
		entityManager.merge(location);
		return true;
	}

	public boolean deleteLocation(final Location location) {
		if (location == null) {
			return false;
		}
		entityManager.remove(location);
		return true;
	}

	public Location readLocation(final Integer id) {
		if (id == null) {
			return null;
		}
		return entityManager.find(Location.class, id);
	}

	public boolean deleteClients(final Clients clients) {
		if (clients == null) {
			return false;
		}
		entityManager.remove(clients);
		return true;

	}

}
