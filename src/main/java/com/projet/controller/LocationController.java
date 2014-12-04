package com.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projet.model.entity.Chauffeur;
import com.projet.model.entity.Voiture;
import com.projet.model.manager.ProjetManager;

@Controller
@RequestMapping("/location")
public class LocationController {
	@Autowired
	private ProjetManager projetManager;

	@RequestMapping(method = RequestMethod.GET)
	public String name(final ModelMap model) {
		// recup chauffeurs
		final List<Voiture> list = projetManager.getVoitures();
		model.addAttribute("voitures", list);
		final List<Chauffeur> listCh = projetManager.getChauffeurs();
		model.addAttribute("chauffeurs", listCh);
		return "location";
	}
}
