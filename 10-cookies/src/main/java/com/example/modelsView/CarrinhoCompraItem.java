package com.example.modelsView;

import java.awt.ItemSelectable;

import com.example.models.Produto;

public class CarrinhoCompraItem {
	private Produto produto;
	private int quantidade;
	
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	

}
