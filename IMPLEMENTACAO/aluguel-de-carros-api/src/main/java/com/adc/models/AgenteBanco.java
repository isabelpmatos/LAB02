package com.adc.models;

public class AgenteBanco extends Agente {
	
	private Banco banco;	
	public AgenteBanco(Banco banco) {
		super();
		this.banco = banco;
	}
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
}