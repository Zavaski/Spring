package com.pucpr.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "periodo")
public class Periodo {
	@Id
	@GeneratedValue
	private Integer id;
	private Integer semestre;
	@OneToMany(mappedBy="periodo")
	private List<Turma> turmas;
	@OneToMany(mappedBy="periodo")
	private List<Disciplina> disciplinas;
	
	/*###################### SET(s) - GET(s) ############################## */

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSemestre() {
		return semestre;
	}
	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}
	public List<Turma> getTurmas() {
		if(null == turmas){
			turmas = new ArrayList<>();
		}
		return turmas;
	}
	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
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
