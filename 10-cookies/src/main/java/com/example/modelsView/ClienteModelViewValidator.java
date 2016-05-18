package com.example.modelsView;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.example.models.Cliente;

public class ClienteModelViewValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return ClienteModelView.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ClienteModelView clienteModelView;
		clienteModelView = (ClienteModelView) target;
		
		Cliente cliente;
		cliente = clienteModelView.getCliente();
		
		if(! clienteModelView.getConfirmacaoSenha().equals(cliente.getSenha()))
		{
			ValidationUtils.rejectIfEmpty(errors,
											"confirmacaoSenha",
											"",
											"A senha e a confirmação devem ser iguais");
		}
	}
	
}
