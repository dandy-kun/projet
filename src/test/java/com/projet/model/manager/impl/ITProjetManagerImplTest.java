package com.projet.model.manager.impl;

import java.sql.SQLException;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.projet.model.entity.Clients;
import com.projet.model.entity.Location;
import com.projet.model.entity.Voitures;
import com.projet.model.manager.ProjetManager;

@RunWith(MockitoJUnitRunner.class)
public class ITProjetManagerImplTest {

	private ProjetManager projetManager;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);

		final ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring_test.xml");

		projetManager = (ProjetManager) ctx.getBean("projetManagerImpl");

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddClients() throws SQLException {

		final Clients clients = new Clients(1, "nom", "prenom", null);
		final Location location = new Location();
		final Voitures voitures = new Voitures(0, "Ferrari", null, null, 250,
				0, null, 0, 0);
		final Voitures voitures2 = new Voitures(0, "Aston", null, null, 300, 0,
				null, 0, 0);
		projetManager.addVoitures(voitures);
		projetManager.addVoitures(voitures2);

		location.setClient_id(clients);

		final Boolean b1 = projetManager.addClients(clients);
		Assert.assertTrue(b1);

		final Boolean b2 = projetManager.addClients(null);
		Assert.assertFalse(b2);
	}

}
