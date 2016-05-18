package com.example.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService{
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public void cadastrar(Cliente c) {
		clienteRepository.inserir(c);
	}

	@Override
	public List<Cliente> listar() {
		return clienteRepository.listar();
	}

	@Override
	public void deletar(int c) {
		clienteRepository.deletar(c);
		
	}

	@Override
	public void atualizar(Cliente c) {
		clienteRepository.atualizar(c);
		
	}


}
