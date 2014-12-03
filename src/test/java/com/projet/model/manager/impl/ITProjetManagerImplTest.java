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

import com.projet.model.entity.Client;
import com.projet.model.entity.Location;
import com.projet.model.entity.Voiture;
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

		final Client client = new Client(1, "nom", "prenom", null);
		final Location location = new Location();
		final Voiture voitures = new Voiture(0, "Ferrari", null, null, 250, 0,
				null, 0, 0);
		final Voiture voitures2 = new Voiture(0, "Aston", null, null, 300, 0,
				null, 0, 0);
		projetManager.addVoitures(voitures);
		projetManager.addVoitures(voitures2);

		location.setClient_id(client);

		final Boolean b1 = projetManager.addClients(client);
		Assert.assertTrue(b1);

		final Boolean b2 = projetManager.addClients(null);
		Assert.assertFalse(b2);
	}

}