package com.pucpr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pucpr.services.TurmaService;


@Controller
public class TurmaController {
	
	@Autowired
	private TurmaService turmaService;
	
	@RequestMapping("/turmas")
	public String novo() {
		//model.addAttribute("clientemv", new ClienteModelView());
		return "turmas";
	}
	

}
