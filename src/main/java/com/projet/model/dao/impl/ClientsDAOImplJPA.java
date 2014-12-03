package com.projet.model.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.projet.controller.ClientsController;
import com.projet.model.dao.ClientsDAO;
import com.projet.model.entity.Clients;

public class ClientsDAOImplJPA implements ClientsDAO {

	private EntityManager entityManager;

	@Override
	public List<ClientsController> getAllClient() {

		final CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		final CriteriaQuery<ClientsController> cq = builder
				.createQuery(ClientsController.class);
		final Root<ClientsController> root = cq.from(ClientsController.class);
		cq.select(root);
		return entityManager.createQuery(cq).getResultList();

	}

	@Override
	public Clients getClient(final Integer id) {
		if (id == null) {
			return null;
		}
		return entityManager.find(Clients.class, id);

	}

	@Override
	public boolean addClient(final Clients client) {
		if (client == null) {
			return false;
		}
		entityManager.persist(client);
		return true;
	}

	@Override
	public boolean updateClient(final Clients client) {
		if (client == null) {
			return false;
		}
		entityManager.merge(client);
		return true;

	}

	@Override
	public boolean deleteClient(final Clients client) {
		if (client == null) {
			return false;
		}
		entityManager.remove(client);
		return true;

	}

	@Override
	public Object getClients(final Clients any) {
		// TODO Auto-generated method stub
		return null;
	}

}
