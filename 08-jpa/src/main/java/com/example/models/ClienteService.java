package com.example.models;

import java.util.List;

public interface ClienteService {
	void cadastrar(Cliente c);
	List<Cliente> listar();
	void deletar(int c);
	void atualizar(Cliente c);
	
}
