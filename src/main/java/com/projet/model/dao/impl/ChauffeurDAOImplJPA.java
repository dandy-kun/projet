package com.projet.model.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.projet.model.dao.ChauffeurDAO;
import com.projet.model.entity.Chauffeur;
import com.projet.model.entity.Clients;

public class ChauffeurDAOImplJPA implements ChauffeurDAO {

	@PersistenceContext
	private EntityManager entityManager;

	public Chauffeur getChauffeur(final Integer id) {
		if (id == null) {
			return null;
		}
		return entityManager.find(Chauffeur.class, id);
	}

	public List<Chauffeur> getAllChauffeur() {
		final CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		final CriteriaQuery<Chauffeur> cq = builder
				.createQuery(Chauffeur.class);
		final Root<Chauffeur> root = cq.from(Chauffeur.class);
		cq.select(root);
		return entityManager.createQuery(cq).getResultList();
	}

	public boolean createChauffeur(final Chauffeur chauffeur) {
		if (chauffeur == null) {
			return false;
		}
		entityManager.persist(chauffeur);
		return true;
	}

	public boolean updateChauffeur(final Chauffeur chauffeur) {
		if (chauffeur == null) {
			return false;
		}
		entityManager.persist(chauffeur);
		return true;

	}

	public boolean deleteChauffeur(final Chauffeur chauffeur) {
		if (chauffeur == null) {
			return false;
		}
		entityManager.remove(chauffeur);
		return true;
	}

	public boolean delete(final Clients cl) {
		if (cl == null) {
			return false;
		}
		entityManager.remove(cl);
		return true;
	}

}
