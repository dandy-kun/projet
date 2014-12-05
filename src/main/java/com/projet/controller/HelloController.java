package com.projet.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projet.model.manager.ProjetManager;

@Controller
@RequestMapping("/hello")
public class HelloController {

	private ProjetManager projetManager;

	private void init() {
		final ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring.xml");
		projetManager = (ProjetManager) ctx.getBean("projetManagerImpl");
	}

	@RequestMapping(method = RequestMethod.GET)
	public String name() {
		init();
		return "index";

	}

}
