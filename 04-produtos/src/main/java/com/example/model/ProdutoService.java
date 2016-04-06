package com.example.model;

import java.util.List;

public interface ProdutoService {
	List<Produto> obterTodos();
	Produto obeterPorId(long id);
}
