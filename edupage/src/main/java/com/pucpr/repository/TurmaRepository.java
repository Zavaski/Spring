package com.pucpr.repository;

import java.util.List;

import com.pucpr.models.Turma;


public interface TurmaRepository {
	List<Turma> listar();
	Turma selecionarPorId(int id);

}
