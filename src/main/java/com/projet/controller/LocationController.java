package com.projet.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projet.model.entity.Clients;
import com.projet.model.entity.Location;
import com.projet.model.manager.ProjetManager;

@Controller
@RequestMapping("/location")
public class LocationController {

	@RequestMapping(value = "/{locationId}", method = RequestMethod.GET)
	public String printLocation(
			@PathVariable("locationId") final Integer locationId,
			final ModelMap model) {
		final ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring.xml");

		final ProjetManager projetManager = (ProjetManager) ctx
				.getBean("projetManagerImpl");

		final Location location = projetManager.getLocation(locationId);
		final List<Clients> list = projetManager.getClients();

		model.addAttribute("clients", list);

		return "clients";
	}
}
