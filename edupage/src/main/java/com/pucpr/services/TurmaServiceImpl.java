package com.pucpr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pucpr.models.Turma;
import com.pucpr.repository.TurmaRepository;

@Service
public class TurmaServiceImpl implements TurmaService{
	@Autowired
	private TurmaRepository turmaRepository;
	
	@Override
	public List<Turma> listar() {
		// TODO Auto-generated method stub
		return turmaRepository.listar();
	}

}
