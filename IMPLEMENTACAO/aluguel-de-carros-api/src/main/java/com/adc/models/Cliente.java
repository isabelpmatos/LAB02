package com.adc.models;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends User {
	private String rg;
	private String cpf;
	private String endereco;
	private List<String> entidadesEmpregadoras = new ArrayList<>();
	private List<Double> rendasAuferidas = new ArrayList<>();
	private double rendaTotal;
	
	public Cliente() {
		
	}
	
	
	
	public Cliente(String rg, String cpf, String endereco, List<String> entidadesEmpregadoras,
			List<Double> rendasAuferidas, double rendaTotal) {
		super();
		this.rg = rg;
		this.cpf = cpf;
		this.endereco = endereco;
		this.entidadesEmpregadoras = entidadesEmpregadoras;
		this.rendasAuferidas = rendasAuferidas;
		this.rendaTotal = rendaTotal;
	}
	
	public void addEntidades(String entidade) {
		entidadesEmpregadoras.add(entidade);
	}
	public void removeEntidades(String entidade) {
		if(entidadesEmpregadoras.contains(entidade)) {
			entidadesEmpregadoras.remove(entidadesEmpregadoras.indexOf(entidade));
		}
	}
	
	public void addRendas(double renda) {
		rendasAuferidas.add(renda);
	}
	
	public void removeRendas(double renda) {
		if(rendasAuferidas.contains(renda)) {
			rendasAuferidas.remove(rendasAuferidas.indexOf(renda));
		}
	}
	
	public double somaRendas() {
		double soma = 0;
		for(int i = 0; i < rendasAuferidas.size(); i++) {
			soma = soma + rendasAuferidas.get(i);
		}
		return soma;
	}
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public List<String> getEntidadesEmpregadoras() {
		return entidadesEmpregadoras;
	}
	public void setEntidadesEmpregadoras(List<String> entidadesEmpregadoras) {
		this.entidadesEmpregadoras = entidadesEmpregadoras;
	}
	public List<Double> getRendasAuferidas() {
		return rendasAuferidas;
	}
	public void setRendasAuferidas(List<Double> rendasAuferidas) {
		this.rendasAuferidas = rendasAuferidas;
	}
	public double getRendaTotal() {
		return rendaTotal;
	}
	public void setRendaTotal(double rendaTotal) {
		this.rendaTotal = rendaTotal;
	}
	
	
}
