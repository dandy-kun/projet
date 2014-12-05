package com.projet.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.projet.model.entity.Voiture;
import com.projet.model.manager.ProjetManager;

@Controller
@RequestMapping("/listeVoiture")
public class ListeVoiture {

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
		return "listeVoiture";

	}

}
