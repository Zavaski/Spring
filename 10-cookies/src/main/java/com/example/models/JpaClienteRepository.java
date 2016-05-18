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
public class JpaClienteRepository implements ClienteRepository {
	
	@PersistenceContext(name="lojajpa")
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public void inserir(Cliente cliente) {
		entityManager.persist(cliente);
		
	}

	@Override
	public List<Cliente> listar(){
		List<Cliente> clientes;
		try{
			clientes = new ArrayList<>();
		//	return entityManager.createQuery("From Cliente").getResultList();
			Query query = entityManager.createQuery("From Cliente");
			clientes = query.getResultList();	
			return clientes;
		}catch(NoResultException ne){
		}
		return clientes = new ArrayList<>();
	}

	@Override
	public void deletar(int c) {
		//seleciona por id, cria o cliente depois deleta
		entityManager.remove(c);		
	}

	@Override
	public void atualizar(Cliente cliente) {
		entityManager.merge(cliente);
		
	}

	@Override
	public Cliente selecionarPorId(int id) {
		Cliente cliente = new Cliente();
		Query query = entityManager.createQuery("From Cliente Where Cliente.id = :id");
		return cliente = (Cliente) query.getSingleResult();
		
	}
	
}
