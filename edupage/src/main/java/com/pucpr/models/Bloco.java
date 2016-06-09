package com.pucpr.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "bloco")
public class Bloco {
	@Id
	@GeneratedValue
	private Integer id;
	private String descricaoBloco;
	
	@OneToMany(mappedBy="bloco")
	private List<Sala> salas;
	
	@OneToMany(mappedBy="bloco")
	private List<Disciplina> disciplinas;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricaoBloco() {
		return descricaoBloco;
	}
	public void setDescricaoBloco(String descricaoBloco) {
		this.descricaoBloco = descricaoBloco;
	}
	public List<Sala> getSalas() {
		return salas;
	}
	public void setSalas(List<Sala> salas) {
		this.salas = salas;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	
	
	

}
