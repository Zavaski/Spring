package com.example.models;

import java.util.List;

public interface ClienteRepository {
	void inserir(Cliente cliente);
	List<Cliente> listar();
	void deletar(int c);
	void atualizar(Cliente cliente);
	Cliente selecionarPorId(int id);
}
