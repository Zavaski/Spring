package com.example.modelsView;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.example.models.Fluxo;

public class FluxoModelViewValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return FluxoModelView.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		FluxoModelView fluxoModelView;
		fluxoModelView = (FluxoModelView) target;
		
		Fluxo fluxo;
		fluxo = fluxoModelView.getFluxo();
	
	}
}
