package com.projet.model.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.projet.model.dao.LocationDAO;
import com.projet.model.entity.Location;

@Repository
public class LocationDAOImplJPA implements LocationDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Location> getAllLocation() {
		final CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		final CriteriaQuery<Location> cq = builder.createQuery(Location.class);
		final Root<Location> root = cq.from(Location.class);
		cq.select(root);
		return entityManager.createQuery(cq).getResultList();
	}

	@Override
	public boolean createLocation(final Location location) {
		if (location == null) {
			return false;
		}
		entityManager.persist(location);
		return true;
	}

	@Override
	public boolean updateLocation(final Location location) {
		if (location == null) {
			return false;
		}
		entityManager.merge(location);
		return true;
	}

	@Override
	public boolean deleteLocation(final Location location) {
		if (location == null) {
			return false;
		}
		entityManager.remove(location);
		return true;
	}

	@Override
	public Location readLocation(final Integer id) {
		if (id == null) {
			return null;
		}
		return entityManager.find(Location.class, id);
	}

}
