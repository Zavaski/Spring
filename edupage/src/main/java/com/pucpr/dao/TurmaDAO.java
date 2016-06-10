package com.pucpr.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.pucpr.models.Turma;
import com.pucpr.repository.TurmaRepository;

@Primary
@Repository
public class TurmaDAO implements TurmaRepository {
	@PersistenceContext(name="edupage")
	private EntityManager entityManager;

	@Override
	public List<Turma> listar() {
		List<Turma> turmas;
		try{
			turmas = new ArrayList<>();
			Query query = entityManager.createQuery("From Turma");
			turmas = query.getResultList();	
			return turmas;
		}catch(NoResultException ne){
		}
		return turmas = new ArrayList<>();
	}

	@Override
	public Turma selecionarPorId(int id) {
		Turma turma = new Turma();
		Query query = entityManager.createQuery("From Cliente Where Cliente.id = :id");
		return turma = (Turma) query.getSingleResult();	
	}
}
