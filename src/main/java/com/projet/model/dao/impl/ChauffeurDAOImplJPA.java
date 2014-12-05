package com.projet.model.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.projet.model.dao.ChauffeurDAO;
import com.projet.model.entity.Chauffeur;

@Repository
public class ChauffeurDAOImplJPA implements ChauffeurDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Chauffeur getChauffeur(final Integer id) {
		if (id == null) {
			return null;
		}
		return entityManager.find(Chauffeur.class, id);
	}

	@Override
	public List<Chauffeur> getAllChauffeur() {
		final CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		final CriteriaQuery<Chauffeur> cq = builder
				.createQuery(Chauffeur.class);
		final Root<Chauffeur> root = cq.from(Chauffeur.class);
		cq.select(root);
		return entityManager.createQuery(cq).getResultList();
	}

	@Override
	public boolean addChauffeur(final Chauffeur chauffeur) {
		if (chauffeur == null) {
			return false;
		}
		entityManager.persist(chauffeur);
		return true;
	}

	@Override
	public boolean updateChauffeur(final Chauffeur chauffeur) {
		if (chauffeur == null) {
			return false;
		}
		entityManager.persist(chauffeur);
		return true;

	}

	@Override
	public boolean deleteChauffeur(final Chauffeur chauffeur) {
		if (chauffeur == null) {
			return false;
		}
		entityManager.remove(chauffeur);
		return true;
	}

}
