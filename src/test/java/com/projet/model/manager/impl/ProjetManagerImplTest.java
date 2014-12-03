package com.projet.model.manager.impl;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.projet.model.dao.ChauffeurDAO;
import com.projet.model.dao.ClientsDAO;
import com.projet.model.dao.LocationDAO;
import com.projet.model.dao.VoituresDAO;
import com.projet.model.entity.Chauffeur;
import com.projet.model.entity.Clients;
import com.projet.model.entity.Location;
import com.projet.model.entity.Voitures;
import com.projet.model.entity.enumeration.Statut;
import com.projet.model.manager.ProjetManager;

@RunWith(MockitoJUnitRunner.class)
public class ProjetManagerImplTest {

	@Mock
	private ClientsDAO clientDao;

	@Mock
	private VoituresDAO voituresDao;

	@Mock
	private LocationDAO locationDao;

	@Mock
	private ChauffeurDAO chauffeurDao;

	@InjectMocks
	private final ProjetManager projetManagerImpl = new ProjetManagerImpl();

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddVoitures() throws SQLException {

		// Mockito.when(voituresDao.addVoiture(Mockito.any(Voitures.class))).thenReturn(
		// Boolean.TRUE);

		final Voitures voitures = new Voitures(1, "bentley", "gt continental",
				"bleue", 2014, 5000, Statut.LIBRE, 6000, 1000);
		projetManagerImpl.addVoitures(voitures);
		final Boolean b1 = projetManagerImpl.addVoitures(voitures);
		Assert.assertTrue(b1);

	}

	@Test
	public void testGetClients() {
		// Mockito.when(clientsDao.getClients(Mockito.any(Voitures.class))).thenReturn(
		// Boolean.TRUE);
		final Clients client = new Clients(1, "Lecomte", "Henry", "Lille");
		projetManagerImpl.addClients(client);
		projetManagerImpl.getClient(client.getId());
		final List<Clients> listClient = projetManagerImpl.getClients();
		Assert.assertNotNull(listClient);
		Assert.assertEquals(listClient.size(), 1);

	}

	@Test
	public void testAddChauffeur() {
		// Mockito.when(chauffeurDao.addchauffeur(Mockito.any(Chauffeur.class))).thenReturn(
		// Boolean.TRUE);
		final Chauffeur chauffeur = new Chauffeur(1, "Dupond", "Henry", 60);
		projetManagerImpl.addChauffeur(chauffeur);
		final Boolean b1 = projetManagerImpl.addChauffeur(chauffeur);
		Assert.assertTrue(b1);
	}

	@Test
	public void testAddClients() {
		// Mockito.when(chauffeurDao.addchauffeur(Mockito.any(Chauffeur.class))).thenReturn(
		// Boolean.TRUE);
		final Clients client = new Clients(1, "Lecomte", "Henry", "Lille");
		projetManagerImpl.addClients(client);
		final Boolean b1 = projetManagerImpl.addClients(client);
		Assert.assertTrue(b1);
	}

	@Test
	public void testAddLocation() throws ParseException {
		// Mockito.when(chauffeurDao.addchauffeur(Mockito.any(Chauffeur.class))).thenReturn(
		// Boolean.TRUE);
		final Date dateDebut = new SimpleDateFormat("mm/dd/yyyy", Locale.FRANCE)
				.parse("12/25/2014");
		final Date dateFin = new SimpleDateFormat("mm/dd/yyyy", Locale.FRANCE)
		.parse("12/28/2014");

		final Location location = new Location(1, dateDebut, dateFin, null,
				3000.f, null, null, null);
		projetManagerImpl.addLocation(location);
		final Boolean b1 = projetManagerImpl.addLocation(location);
		Assert.assertTrue(b1);
	}

	@Test
	public void testRemoveClients() {
		// Mockito.when(chauffeurDao.addchauffeur(Mockito.any(Chauffeur.class))).thenReturn(
		// Boolean.TRUE);
		final Clients client = new Clients(1, "Lecomte", "Henry", "Lille");
		projetManagerImpl.removeClients(client);
		final Boolean b1 = projetManagerImpl.removeClients(client);
		Assert.assertTrue(b1);
	}

	@Test
	public void testGetClientsInteger() {
		// Mockito.when(clientsDao.getClients(Mockito.any(Voitures.class))).thenReturn(
		// Boolean.TRUE);
		final Clients client = new Clients(1, "Lecomte", "Henry", "Lille");
		projetManagerImpl.addClients(client);
		projetManagerImpl.getClient(client.getId());
		final List<Clients> listClient = projetManagerImpl.getClients();
		Assert.assertNotNull(listClient);
		Assert.assertEquals(listClient.size(), 1);
	}

	@Test
	public void testUpdateClient() {
		// Mockito.when(chauffeurDao.addchauffeur(Mockito.any(Chauffeur.class))).thenReturn(
		// Boolean.TRUE);
		final Clients client = new Clients(1, "Lecomte", "Henry", "Lille");

		projetManagerImpl.addClients(client);
		projetManagerImpl.updateClient(client);

	}

}
