package com.projet.controller;

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

	@RequestMapping
	public String printChauffeur(final ModelMap model) {
		init();
		final List<Chauffeur> list = projetManager.getChauffeurs();
		model.addAttribute("chauffeur", list);
		return "chauffeur";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addChauffeur(final ModelMap model) {
		final Chauffeur chauffeur = new Chauffeur();
		model.addAttribute("chauffeur", new Chauffeur());
		return "addChauffeur";
	}

	// Traitement
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String handleForm(
			@ModelAttribute("chauffeur") final Chauffeur chauffeur,
			final ModelMap model) {

		if (chauffeur != null && chauffeur.getNom() != null
				&& !chauffeur.getNom().isEmpty()
				&& chauffeur.getPrenom() != null
				&& !chauffeur.getPrenom().isEmpty()) {

			final ApplicationContext ctx = new ClassPathXmlApplicationContext(
					"spring.xml");
			final ProjetManager projetManager = (ProjetManager) ctx
					.getBean("projetManagerImpl");
			projetManager.addChauffeur(chauffeur);
			return "redirect:/chauffeur";
		}

		model.addAttribute("chauffeur", chauffeur);
		return "addChauffeur";
	}

	@RequestMapping(value = "/edit/{chauffeurId}", method = RequestMethod.GET)
	public String editChauffeur(
			@PathVariable("chauffeurId") final Integer chauffeurId,
			final ModelMap model) {

		final ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring.xml");
		final ProjetManager projetManager = (ProjetManager) ctx
				.getBean("projetManagerImpl");
		final Chauffeur chauffeur = projetManager.getChauffeur(chauffeurId);
		model.addAttribute("chauffeur", chauffeur);
		return "modifChauffeur";
	}

	@RequestMapping(value = "/edit/{chauffeurId}", method = RequestMethod.POST)
	public String editChauffeurReponse(
			@ModelAttribute("chauffeur") final Chauffeur chauffeur,
			@PathVariable("chauffeurId") final Integer chauffeurId,
			final ModelMap model) {

		if (chauffeur.getNom() != null && !chauffeur.getNom().isEmpty()
				&& chauffeur.getPrenom() != null
				&& !chauffeur.getPrenom().isEmpty()) {

			chauffeur.setId(chauffeurId);
			projetManager.updateChauffeur(chauffeur);

			return "redirect:/chauffeur";
		}
		model.addAttribute("chauffeur", chauffeur);
		return "modifChauffeur";
	}
}