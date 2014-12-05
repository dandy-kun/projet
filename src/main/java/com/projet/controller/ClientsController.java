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
		final Client client = new Client();
		model.addAttribute("client", client);
		return "client";
	}

	// Traitement
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("client") final Client client,
			final ModelMap model) {
		init();
		if (client != null && client.getNom() != null
				&& !client.getNom().isEmpty() && client.getPrenom() != null
				&& !client.getPrenom().isEmpty()) {
			projetManager.addClient(client);
			return "redirect:/client";
		}
		model.addAttribute("clients", client);
		return "client";

	}

	@RequestMapping(value = "/edit/{clientId}", method = RequestMethod.POST)
	public String editClientReponse(

			@ModelAttribute("client") final Client client,
			@PathVariable("clientId") final Integer clientId,
			final ModelMap model) {
		init();
		if (client.getNom() != null && !client.getNom().isEmpty()
				&& client.getPrenom() != null && !client.getPrenom().isEmpty()) {

			client.setId(clientId);
			projetManager.updateClient(client);

			return "redirect:/client";
		}
		model.addAttribute("client", client);
		return "client";
	}

	@RequestMapping(value = "/remove/{Id}", method = RequestMethod.GET)
	public String removeClientReponse(@PathVariable("Id") final Integer Id,
			final ModelMap model) throws SQLException {
		init();
		projetManager.removeClient(Id);
		return "redirect:/client";

	}
}
