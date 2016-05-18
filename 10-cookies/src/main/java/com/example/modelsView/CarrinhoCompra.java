package com.example.modelsView;

import java.awt.ItemSelectable;
import java.util.ArrayList;
import java.util.List;

import com.example.models.Produto;

public class CarrinhoCompra {
	private List<CarrinhoCompraItem> items;
	
	public CarrinhoCompra(){
		items = new ArrayList<CarrinhoCompraItem>();
	}

	public List<CarrinhoCompraItem> getItems() {
		return items;
	}

	public void setItems(List<CarrinhoCompraItem> items) {
		this.items = items;
	}
	
	
	public void adicionar(Produto produto, int quantidade){
		CarrinhoCompraItem item;
		item = new CarrinhoCompraItem();
		item.setProduto(produto);
		item.setQuantidade(quantidade);
		items.add(item);
	}
	
}
