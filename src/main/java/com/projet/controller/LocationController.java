package com.projet.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projet.model.entity.Chauffeur;
import com.projet.model.entity.Client;
import com.projet.model.entity.Location;
import com.projet.model.entity.Voiture;
import com.projet.model.entity.enumeration.Etat;
import com.projet.model.entity.enumeration.Statut;
import com.projet.model.manager.ProjetManager;

@Controller
@RequestMapping("/location")
public class LocationController {
	private ProjetManager projetManager;

	private void init() {
		final ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring.xml");
		projetManager = (ProjetManager) ctx.getBean("projetManagerImpl");
	}

	@RequestMapping(method = RequestMethod.GET)
	public String name(final ModelMap model) {
		init();
		final List<Client> clients = projetManager.getClients();
		final List<Location> locations = projetManager.getLocations();
		final List<Chauffeur> chauffeurs = projetManager.getChauffeurs();
		final List<Voiture> list = projetManager.getVoitures();
		model.addAttribute("voitures", list);
		model.addAttribute("clients", clients);
		model.addAttribute("locations", locations);
		model.addAttribute("chauffeurs", chauffeurs);
		model.addAttribute("location", new Location());
		return "location";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addLocationReponse(
			@ModelAttribute("location") final Location location,
			@ModelAttribute("idChauffeur") final Integer idChauffeur,
			@ModelAttribute("idVoiture") final Integer idVoiture,
			@ModelAttribute("idClient") final Integer idClient,
			@ModelAttribute("etat") final Etat etat, final ModelMap model)
			throws SQLException {

		final Chauffeur chauffeur = projetManager.getChauffeur(idChauffeur);
		location.setChauffeur_id(chauffeur);

		final Voiture voiture = projetManager.getVoiture(idVoiture);
		location.setVoiture_id(voiture);
		location.setEtat(etat);
		voiture.setStatut(Statut.LOCATION);

		final Client client = projetManager.getClient(idClient);
		location.setClient_id(client);

		projetManager.addLocation(location);
		return "redirect:/location";

	}
}
