package br.com.zvsk.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.zvsk.model.ProdutoService;

@Controller
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping("/produtos")
	public String todos(Model model){
		model.addAttribute("produtos", produtoService.obterTodos());
		return "produtos";
	}
}
