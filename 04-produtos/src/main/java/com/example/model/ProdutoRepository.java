package com.example.model;

import java.util.List;

public interface ProdutoRepository {
	List<Produto> obterTodos();
	Produto obeterPorId(long id);

	}
