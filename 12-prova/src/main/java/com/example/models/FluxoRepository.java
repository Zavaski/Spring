package com.example.models;

import java.util.List;

public interface FluxoRepository {
	void inserir(Fluxo fluxo);
	List<Fluxo> listar();

}
