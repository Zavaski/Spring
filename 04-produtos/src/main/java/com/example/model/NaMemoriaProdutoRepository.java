package com.example.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class NaMemoriaProdutoRepository implements ProdutoRepository {
	private static List<Produto> produtos =  new ArrayList<>();
	static{
		produtos.add(new Produto());
		produtos.get(0).setId(1L);
		produtos.get(0).setNome("Table Samsung");
		produtos.get(0).setPreco(899.00);
		produtos.get(0).setCategoria(new Categoria());
		produtos.get(0).getCategoria().setId(1);
		produtos.get(0).getCategoria().setNome("Eletrônica");
		
		produtos.add(new Produto());
		produtos.get(1).setId(2L);
		produtos.get(1).setNome("Celular Iphone 5s");
		produtos.get(1).setPreco(4_500.00);
		produtos.get(1).setCategoria(produtos.get(0).getCategoria());;

		
		produtos.add(new Produto());
		produtos.get(2).setId(3L);
		produtos.get(2).setNome("Livro Java Como Programar");
		produtos.get(2).setPreco(400.00);
		produtos.get(2).setCategoria(new Categoria());
		produtos.get(2).getCategoria().setId(2);
		produtos.get(2).getCategoria().setNome("Livros");
		
		
	}
	
	@Override
	public List<Produto> obterTodos() {
		// TODO Auto-generated method stub
		return produtos;
	}

	@Override
	public Produto obeterPorId(long id) {
		// TODO Auto-generated method stub
		return produtos.stream().filter(p -> p.getId() == id).findFirst().get();
	}

}
