package com.pucpr.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "horario")
public class Horario {
	@Id
	@GeneratedValue
	private Integer id;
	private Date horarioInicial;
	private Date horarioFinal;
	private String diaDaSemana;
	
	@ManyToOne
	@JoinColumn(name = "disciplina_id")
	private Disciplina disciplina;
	public Date getHorarioInicial() {
		return horarioInicial;
	}
	public void setHorarioInicial(Date horarioInicial) {
		this.horarioInicial = horarioInicial;
	}
	public Date getHorarioFinal() {
		return horarioFinal;
	}
	public void setHorarioFinal(Date horarioFinal) {
		this.horarioFinal = horarioFinal;
	}
	public String getDiaDaSemana() {
		return diaDaSemana;
	}
	public void setDiaDaSemana(String diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	

}
