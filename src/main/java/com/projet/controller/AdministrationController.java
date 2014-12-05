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
import com.projet.model.entity.Voiture;
import com.projet.model.manager.ProjetManager;

@Controller
@RequestMapping("/administration")
public class AdministrationController {
	private ProjetManager projetManager;

	private void init() {
		final ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring.xml");
		projetManager = (ProjetManager) ctx.getBean("projetManagerImpl");
	}

	@RequestMapping()
	public String name(final ModelMap model) {
		init();
		final List<Voiture> list = projetManager.getVoitures();
		model.addAttribute("voitures", list);
		final List<Chauffeur> listCh = projetManager.getChauffeurs();
		model.addAttribute("chauffeurs", listCh);
		final Voiture voiture = new Voiture();
		model.addAttribute("voiture", voiture);
		return "administration";

	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addVoiture(@ModelAttribute("voiture") final Voiture voiture,
			final ModelMap model) {
		init();
		projetManager.addVoiture(voiture);
		return "redirect:/administration";

	}

	@RequestMapping(value = "/remove/{Id}", method = RequestMethod.GET)
	public String removeClientReponse(@PathVariable("Id") final Integer Id,
			final ModelMap model) throws SQLException {
		init();

		projetManager.removeVoiture(Id);
		return "redirect:/administration";

	}
}