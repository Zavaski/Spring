package com.example.models;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.*;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary
@Repository
public class JpaFluxoRepository implements FluxoRepository {
	
	@PersistenceContext(name="lojajpa")
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public void inserir(Fluxo fluxo) {
		entityManager.persist(fluxo);
		
	}
	@Override
	public List<Fluxo> listar(){
		List<Fluxo> fluxos;
		try{
			fluxos = new ArrayList<>();
			Query query = entityManager.createQuery("From Fluxo");
			fluxos = query.getResultList();	
			return fluxos;
		}catch(NoResultException ne){
		}
		return fluxos = new ArrayList<>();
	}


	
}
