package com.example.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.models.FluxoService;
import com.example.modelsView.FluxoModelView;
import com.example.modelsView.FluxoModelViewValidator;

@Controller
public class FluxoController {
	//controller tem funcao de buscar o servicos para o service
	// o service tem funcao de 
	
	@Autowired
	private FluxoService fluxoService;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder){
		binder.addValidators(new FluxoModelViewValidator());
	}

	@RequestMapping(value = "/fluxos/novo", method = RequestMethod.GET)
	public String novo(Model model) {
		model.addAttribute("fluxomv", new FluxoModelView());
		return "fluxo-novo";
	}
		
	@RequestMapping(value = "/fluxos/novo", method = RequestMethod.POST)
	public String cadastrar(@Valid
							@ModelAttribute("fluxomv")
							FluxoModelView fluxomv, 
							BindingResult bindingResult) 
	{
		if(bindingResult.hasErrors()){
			return "fluxo-novo";
		}
		else{
			fluxoService.cadastrar(fluxomv.getFluxo());
			return "redirect:/fluxos/novo-sucesso";
		}
	}

	@RequestMapping("/fluxos/novo-sucesso")
	public String novoSucesso(Model model) {
		model.addAttribute("fluxos", fluxoService.listar());		
		return "fluxo-novo-sucesso";
	}

	
}
