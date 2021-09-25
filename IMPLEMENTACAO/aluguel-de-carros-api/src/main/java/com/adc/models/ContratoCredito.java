package com.adc.models;

public class ContratoCredito {
	private Banco banco;
	private double valorCredito;
	private Contrato contrato;
	
	public ContratoCredito(Banco banco, double valorCredito, Contrato contrato) {
		super();
		this.banco = banco;
		this.valorCredito = valorCredito;
		this.contrato = contrato;
	}
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public Contrato getContrato() {
		return contrato;
	}
	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}
	
	
}
