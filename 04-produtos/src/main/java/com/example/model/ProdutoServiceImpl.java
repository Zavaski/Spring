package com.example.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	@Override
	public List<Produto> obterTodos() {
		// TODO Auto-generated method stub
		return produtoRepository.obterTodos();
	}

	@Override
	public Produto obeterPorId(long id) {
		// TODO Auto-generated method stub
		return produtoRepository.obeterPorId(id);
	}
}
