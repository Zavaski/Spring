package com.example.modelsView;

import javax.validation.Valid;

import com.example.models.Cliente;

public class ClienteModelView {
	@Valid
	private Cliente cliente;
	private String confirmacaoSenha;
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getConfirmacaoSenha() {
		return confirmacaoSenha;
	}
	public void setConfirmacaoSenha(String confirmacaoSenha) {
		this.confirmacaoSenha = confirmacaoSenha;
	}
	
	
}
