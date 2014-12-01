package com.projet.model.dao.impl;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.projet.model.dao.VoituresDAO;
import com.projet.model.entity.Voitures;

@Repository
public class VoituresDAOImplJPA implements VoituresDAO {

	@PersistenceContext
	private EntityManager entityManager;

	public boolean create(final Voitures obj) throws SQLException {
		if (obj == null) {
			return false;
		}
		entityManager.persist(obj);
		return true;
	}

	public boolean delete(final Voitures obj) throws SQLException {
		if (obj == null) {
			return false;
		}
		entityManager.remove(obj);
		return true;
	}

	public boolean update(final Voitures obj) throws SQLException {
		if (obj == null) {
			return false;
		}
		entityManager.merge(obj);
		return true;
	}

	public Voitures find(final Integer id) throws SQLException {
		if (id == null) {
			return null;
		}
		return entityManager.find(Voitures.class, id);
	}

	public List<Voitures> findAll() {
		final CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		final CriteriaQuery<Voitures> cq = builder.createQuery(Voitures.class);
		final Root<Voitures> root = cq.from(Voitures.class);
		cq.select(root);
		return entityManager.createQuery(cq).getResultList();
	}

	public List<Voitures> getAllVoitures() {
		// TODO Auto-generated method stub
		return null;
	}

	public Voitures getVoiture(final int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addVoiture(final Voitures voiture) {
		// TODO Auto-generated method stub

	}

	public Voitures updateVoiture(final Voitures voiture) {
		// TODO Auto-generated method stub
		return null;
	}

	public Voitures deleteVoiture(final Voitures voiture) {
		// TODO Auto-generated method stub
		return null;
	}

}
