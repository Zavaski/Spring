package com.pucpr.services;

import java.util.List;

import com.pucpr.models.Turma;

public interface TurmaService {
	List<Turma> listar();
	Turma selecionarPorId(int id);

}
