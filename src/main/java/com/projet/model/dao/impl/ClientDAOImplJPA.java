package com.projet.model.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.projet.model.dao.ClientDAO;
import com.projet.model.entity.Client;

@Repository
public class ClientDAOImplJPA implements ClientDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Client> getAllClient() {

		final CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		final CriteriaQuery<Client> cq = builder.createQuery(Client.class);
		final Root<Client> root = cq.from(Client.class);
		cq.select(root);
		return entityManager.createQuery(cq).getResultList();

	}

	@Override
	public Client getClient(final Integer id) {
		if (id == null) {
			return null;
		}
		return entityManager.find(Client.class, id);

	}

	@Override
	public boolean addClient(final Client client) {
		if (client == null) {
			return false;
		}
		entityManager.persist(client);
		return true;
	}

	@Override
	public boolean updateClient(final Client client) {
		if (client == null) {
			return false;
		}
		entityManager.merge(client);
		return true;

	}

	@Override
	public boolean deleteClient(final Client client) {
		if (client == null) {
			return false;
		}
		entityManager.remove(client);
		return true;

	}

	@Override
	public Object getClients(final Client any) {
		// TODO Auto-generated method stub
		return null;
	}

}
