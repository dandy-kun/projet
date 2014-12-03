package com.projet.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projet.model.entity.Client;
import com.projet.model.entity.Location;
import com.projet.model.manager.ProjetManager;

@Controller
@RequestMapping("/voitures")
public class VoituresController {

	@RequestMapping(value = "/{voituresId}", method = RequestMethod.GET)
	public String printLocation(
			@PathVariable("voituresId") final Integer voituresId,
			final ModelMap model) {
		final ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring.xml");

		final ProjetManager projetManager = (ProjetManager) ctx
				.getBean("projetManagerImpl");

		// FIXME
		final Location location = projetManager.getLocation(null);
		final List<Clients> list = projetManager.getClients();

		model.addAttribute("location", list);

		return "location";
	}
}
