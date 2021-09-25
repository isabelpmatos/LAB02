package com.adc.models;

public class AgenteEmpresa extends Agente {
	Empresa empresa;
	
	public AgenteEmpresa(Empresa empresa) {
		super();
		this.empresa = empresa;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
}
