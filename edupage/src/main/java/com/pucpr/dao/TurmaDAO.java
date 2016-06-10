package com.pucpr.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.pucpr.models.Turma;
import com.pucpr.repository.TurmaRepository;

@Primary
@Repository
public class TurmaDAO implements TurmaRepository {
	@PersistenceContext(name="lojajpa")
	private EntityManager entityManager;

	@Override
	public List<Turma> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Turma selecionarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
