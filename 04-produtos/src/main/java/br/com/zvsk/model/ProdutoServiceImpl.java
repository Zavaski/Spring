package br.com.zvsk.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ProdutoServiceImpl implements ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	@Override
	public List<Produto> obterTodos() {
		// TODO Auto-generated method stub
		return produtoRepository.obterTodos();
	}

}
