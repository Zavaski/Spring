package br.com.zvsk.model;

import java.util.ArrayList;
import java.util.List;

public class NaMemoriaProdutoRepository implements ProdutoRepository {
	private static List<Produto> produtos =  new ArrayList<>();
	static{
		produtos.add(new Produto());
		produtos.get(0).setId(1L);
		produtos.get(1).setNome("Table Samsung");
		produtos.get(2).setPreco(899.00);
		
		produtos.add(new Produto());
		produtos.get(0).setId(2L);
		produtos.get(1).setNome("Celular Iphone 5s");
		produtos.get(2).setPreco(4_500.00);
		
		produtos.add(new Produto());
		produtos.get(0).setId(3L);
		produtos.get(1).setNome("Livro Java Como Programar");
		produtos.get(2).setPreco(400.00);
		
		
		
	}
	
	@Override
	public List<Produto> obterTodos() {
		// TODO Auto-generated method stub
		return produtos;
	}

}
