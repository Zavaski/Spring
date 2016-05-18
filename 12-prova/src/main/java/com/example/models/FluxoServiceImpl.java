package com.example.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FluxoServiceImpl implements FluxoService{
	@Autowired
	private FluxoRepository fluxoRepository;
	
	@Override
	public void cadastrar(Fluxo f) {
		fluxoRepository.inserir(f);
	}

	@Override
	public List<Fluxo> listar() {
		return fluxoRepository.listar();
	}



}
