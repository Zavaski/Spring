package com.example.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.models.Produto;
import com.example.models.ProdutoService;
import com.example.modelsView.CarrinhoCompra;
import com.example.modelsView.CarrinhoCompraItem;
@Controller
public class CarrinhoCompraController {

	
	@Autowired
	private ProdutoService produtoService;
	@RequestMapping(value="/carrinho-compra", method=RequestMethod.GET)

	public String listar(){
		return "carrinho-compra";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/carrinho-compra")
	public String adicionar(@RequestParam("produtoId")long produtoId, HttpServletRequest request){
		CarrinhoCompra carrinho;
		
		carrinho = (CarrinhoCompra) request.getSession().getAttribute("CarrinhoCompras");
		if(carrinho == null){
			carrinho = new CarrinhoCompra();
			request.getSession().setAttribute("CarrinhoCompra", carrinho);
		}
		CarrinhoCompraItem item;
		item = carrinho.getItems().stream().filter(i -> i.getProduto().getId() == produtoId).findFirst().orElse(null);
		
		if(item != null){
			item.setQuantidade(item.getQuantidade() + 1);
		}
		else{
			Produto produto;
			produto = produtoService.obterPorId(produtoId);
			if(produto == null){
				throw new IllegalArgumentException("Codigo de produto invalido");
			}
			carrinho.adicionar(produto, 1);
		}
		return "redirect:/carrinho-compra";
	}
}
