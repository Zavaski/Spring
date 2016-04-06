package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Produto;
import com.example.model.ProdutoService;

@Controller
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping("/produtos")
	public String todos(Model model){
		model.addAttribute("produtos", produtoService.obterTodos());
		return "produtos";
	}
	@RequestMapping("/detalhe/{id}")
	public String detalhe(@PathVariable("id")long id, Model model){
		Produto produto;
		produto = produtoService.obeterPorId(id);
		model.addAttribute("produto", produto);
		
		return "produto-detalhe";
	}
	
}
