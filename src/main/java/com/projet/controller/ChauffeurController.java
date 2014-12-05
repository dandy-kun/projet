package com.projet.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projet.model.entity.Chauffeur;
import com.projet.model.manager.ProjetManager;

@Controller
@RequestMapping("/chauffeur")
public class ChauffeurController {

	private ProjetManager projetManager;

	public void init() {

		final ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring.xml");
		projetManager = (ProjetManager) ctx.getBean("projetManagerImpl");
	}

	// renvoie une page avec une liste de chauffeur (liste chauffeur)
	@RequestMapping
	public String name(final ModelMap model) {
		init();
		final List<Chauffeur> list = projetManager.getChauffeurs();
		model.addAttribute("chauffeurs", list);
		Chauffeur chauffeur = new Chauffeur();
		model.addAttribute("chauffeur", chauffeur);
		return "chauffeur";
	}

	// Traitement

	@RequestMapping(value = "/edit/{chauffeurId}", method = RequestMethod.POST)
	public String editChauffeurReponse(
			@ModelAttribute("chauffeur") final Chauffeur chauffeur,
			@PathVariable("chauffeurId") final Integer chauffeurId,
			final ModelMap model) {
		init();
		if (chauffeur.getNom() != null && !chauffeur.getNom().isEmpty()
				&& chauffeur.getPrenom() != null
				&& !chauffeur.getPrenom().isEmpty()) {

			chauffeur.setId(chauffeurId);
			projetManager.updateChauffeur(chauffeur);

			return "redirect:/chauffeur";
		}
		model.addAttribute("chauffeur", chauffeur);
		return "chauffeur";
	}

	@RequestMapping(value = "/remove/{Id}", method = RequestMethod.GET)
	public String removeChauffeurReponse(@PathVariable("Id") final Integer Id,
			final ModelMap model) throws SQLException {
		init();

		projetManager.removeChauffeur(Id);
		return "redirect:/chauffeur";

	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addChauffeur(
			@ModelAttribute("chauffeur") final Chauffeur chauffeur,
			final ModelMap model) {
		init();
		projetManager.addChauffeur(chauffeur);
		return "redirect:/chauffeur";

	}
}