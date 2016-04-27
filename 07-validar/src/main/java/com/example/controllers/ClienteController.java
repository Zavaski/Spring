package com.example.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.models.ClienteService;
import com.example.modelsView.ClienteModelView;
import com.example.modelsView.ClienteModelViewValidator;

@Controller
public class ClienteController {
	//controller tem funcao de buscar o servicos para o service
	// o service tem funcao de 
	
	@InitBinder
	protected void initBinder(WebDataBinder binder){
		binder.addValidators(new ClienteModelViewValidator());
	}
	
	@Autowired
	private ClienteService clienteService;

	@RequestMapping(value = "/clientes/novo", method = RequestMethod.GET)
	public String novo(Model model) {
		model.addAttribute("clientemv", new ClienteModelView());
		return "cliente-novo";
	}

	@RequestMapping(value = "/clientes/novo", method = RequestMethod.POST)
	public String cadastrar(@Valid
							@ModelAttribute("clientemv")
							ClienteModelView clientemv, 
							BindingResult bindingResult) 
	{
		if(bindingResult.hasErrors()){
			return "cliente-novo";
		}
		else{
			clienteService.cadastrar(clientemv.getCliente());
			return "redirect:/clientes/novo-sucesso";
		}
	}

	@RequestMapping("/clientes/novo-sucesso")
	public String novoSucesso() {
		return "cliente-novo-sucesso";
	}

}
