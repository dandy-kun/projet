package com.projet.model.dao.impl;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.projet.model.dao.VoitureDAO;
import com.projet.model.entity.Voiture;

@Repository
public class VoitureDAOImplJPA implements VoitureDAO {

	@PersistenceContext
	private EntityManager entityManager;

	public boolean addVoitures(final Voiture obj) throws SQLException {
		if (obj == null) {
			return false;
		}
		entityManager.persist(obj);
		return true;
	}

	public boolean deleteVoitures(final Voiture obj) throws SQLException {
		if (obj == null) {
			return false;
		}
		entityManager.remove(obj);
		return true;
	}

	public boolean updateVoitures(final Voiture obj) throws SQLException {
		if (obj == null) {
			return false;
		}
		entityManager.merge(obj);
		return true;
	}

	public Voiture getVoitures(final Integer id) throws SQLException {
		if (id == null) {
			return null;
		}
		return entityManager.find(Voiture.class, id);
	}

	public List<Voiture> getAllVoitures() {
		final CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		final CriteriaQuery<Voiture> cq = builder.createQuery(Voiture.class);
		final Root<Voiture> root = cq.from(Voiture.class);
		cq.select(root);
		return entityManager.createQuery(cq).getResultList();
	}

}
