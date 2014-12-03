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

import com.projet.model.entity.Client;
import com.projet.model.manager.ProjetManager;

@Controller
@RequestMapping("/client")
public class ClientsController {

	private ProjetManager projetManager;

	public void init() {

		final ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring.xml");
		projetManager = (ProjetManager) ctx.getBean("projetManagerImpl");
	}

	@RequestMapping
	public String printClient(final ModelMap model) {
		init();
		final List<Client> list = projetManager.getClients();
		model.addAttribute("clients", list);
		return "client";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addClient(final ModelMap model) {
		final Client client = new Client();
		model.addAttribute("client", new Client());
		return "addClient";
	}

	// Traitement
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("client") final Client client,
			final ModelMap model) {

		if (client != null && client.getNom() != null
				&& !client.getNom().isEmpty() && client.getPrenom() != null
				&& !client.getPrenom().isEmpty()) {
			final ApplicationContext ctx = new ClassPathXmlApplicationContext(
					"spring.xml");
			final ProjetManager projetManager = (ProjetManager) ctx
					.getBean("projetManagerImpl");
			projetManager.addClients(client);
			return "redirect:/client";
		}
		model.addAttribute("clients", client);
		return "addClient";

	}

	@RequestMapping(value = "/edit/{clientId}", method = RequestMethod.GET)
	public String editClient(@PathVariable("clientId") final Integer clientId,
			final ModelMap model) {

		final ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring.xml");
		final ProjetManager projetManager = (ProjetManager) ctx
				.getBean("projetManagerImpl");
		final Client client = projetManager.getClient(clientId);
		model.addAttribute("client", client);
		return "modifClient";

	}

	@RequestMapping(value = "/edit/{clientId}", method = RequestMethod.POST)
	public String editClientReponse(
			@ModelAttribute("client") final Client client,
			@PathVariable("clientId") final Integer clientId,
			final ModelMap model) {

		if (client.getNom() != null && !client.getNom().isEmpty()
				&& client.getPrenom() != null && !client.getPrenom().isEmpty()) {

			client.setId(clientId);
			projetManager.updateClient(client);

			return "redirect:/client";
		}
		model.addAttribute("client", client);
		return "modifClients";
	}
}
