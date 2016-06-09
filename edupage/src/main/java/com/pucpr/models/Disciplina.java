package com.pucpr.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "disciplina")
public class Disciplina {
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private String codigoDisciplina;
	@ManyToOne
	@JoinColumn(name = "professor_id")
	private Professor professor;
	@ManyToOne
	@JoinColumn(name = "curso_id")
	private Curso curso;
	@OneToMany(mappedBy="disciplina")
	private List<Horario> horarios;
	@ManyToOne
	@JoinColumn(name = "periodo_id")
	private Periodo periodo;
	@ManyToOne
	@JoinColumn(name = "instituicao_id")
	private Instituicao instituicao;
	
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
	public String getCodigoDisciplina() {
		return codigoDisciplina;
	}
	public void setCodigoDisciplina(String codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public List<Horario> getHorarios() {
		if(null == horarios){
			horarios = new ArrayList<>();
		}
		return horarios;
	}
	public void setHorarios(List<Horario> horarios) {
		this.horarios = horarios;
	}
	public Periodo getPeriodo() {
		return periodo;
	}
	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}
	public Instituicao getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

	
	
	
	

}
