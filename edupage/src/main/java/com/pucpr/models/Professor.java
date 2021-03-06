package com.pucpr.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "professor")
public class Professor {
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private Integer codigoProfessor;
	@OneToMany(mappedBy="professor")
	private List<Disciplina> disciplinas;
	
	
	/*###################### SET(s) - GET(s) ############################## */
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCodigoProfessor() {
		return codigoProfessor;
	}
	public void setCodigoProfessor(Integer codigoProfessor) {
		this.codigoProfessor = codigoProfessor;
	}
	public List<Disciplina> getDisciplinas() {
		if(null == disciplinas){
			disciplinas = new ArrayList<>();
		}
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	
	

}
