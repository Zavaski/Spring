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
@Table(name = "bloco")
public class Bloco {
	@Id
	@GeneratedValue
	private Integer id;
	private String descricaoBloco;
	@OneToMany(mappedBy="bloco")
	private List<Sala> salas;
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
	public String getDescricaoBloco() {
		return descricaoBloco;
	}
	public void setDescricaoBloco(String descricaoBloco) {
		this.descricaoBloco = descricaoBloco;
	}
	public List<Sala> getSalas() {
		if(null == salas){
			salas = new ArrayList<>();
		}
		return salas;
	}
	public void setSalas(List<Sala> salas) {
		this.salas = salas;
	}
	public Instituicao getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

}
