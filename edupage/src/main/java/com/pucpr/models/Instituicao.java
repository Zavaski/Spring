package com.pucpr.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "instituicao")
public class Instituicao {
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private String endereco;
	@OneToMany(mappedBy="instituicao")
	private List<Disciplina> disciplinas;
	@OneToMany(mappedBy="instituicao")
	private List<Bloco> blocos;
	
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
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
	public List<Bloco> getBlocos() {
		if(null == blocos){
			blocos = new ArrayList<>();
		}
		return blocos;
	}
	public void setBlocos(List<Bloco> blocos) {
		this.blocos = blocos;
	}
	
	
	
	
}
