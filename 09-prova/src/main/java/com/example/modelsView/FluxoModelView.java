package com.example.modelsView;


import javax.validation.Valid;

import com.example.models.Fluxo;

public class FluxoModelView {
	@Valid
	private Fluxo fluxo;

	public Fluxo getFluxo() {
		return fluxo;
	}

	public void setFluxo(Fluxo fluxo) {
		this.fluxo = fluxo;
	}

	
	
	
	
}
