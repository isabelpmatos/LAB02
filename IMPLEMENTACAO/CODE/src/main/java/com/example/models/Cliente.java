package com.example.models;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.User;

@Entity
@Table(name="clientes")
public class Cliente extends User{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false, unique = true, length = 8)
	private String rg;
	@Column(nullable = false, unique = true, length = 11)
	private String cpf;
	@Column(nullable = false, length = 50)
	private String endereco;
	@Column(nullable = false, length = 20)
	private String profissao;
	@OneToMany
	private ArrayList<EntidadeEmpregadora> entidadesEmpregadoras;
	private ArrayList<Double> rendasAuferidas;
	
	public Cliente(String rg, String cpf, String endereco, String profissao, ArrayList<EntidadeEmpregadora> entidadesEmpregadoras,
			ArrayList<Double> rendasAuferidas) {
		super();
		this.rg = rg;
		this.cpf = cpf;
		this.endereco = endereco;
		this.profissao = profissao;
		this.entidadesEmpregadoras = entidadesEmpregadoras;
		this.rendasAuferidas = rendasAuferidas;
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
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public ArrayList<EntidadeEmpregadora> getEntidadesEmpregadoras() {
		return entidadesEmpregadoras;
	}
	public void setEntidadesEmpregadoras(ArrayList<EntidadeEmpregadora> entidadesEmpregadoras) {
		this.entidadesEmpregadoras = entidadesEmpregadoras;
	}
	public ArrayList<Double> getRendasAuferidas() {
		return rendasAuferidas;
	}
	public void setRendasAuferidas(ArrayList<Double> rendasAuferidas) {
		this.rendasAuferidas = rendasAuferidas;
	}
	
	public void addEntidades(EntidadeEmpregadora entidade) {
		this.entidadesEmpregadoras.add(entidade);
	}
	public void removeEntidades(EntidadeEmpregadora entidade) {
		if(this.entidadesEmpregadoras.contains(entidade)) {
			this.entidadesEmpregadoras.remove(this.entidadesEmpregadoras.indexOf(entidade));
		}
	}
	public void addRendas(double renda) {
		this.rendasAuferidas.add(renda);
	}
	public void removeRendas(double renda) {
		if(this.rendasAuferidas.contains(renda)) {
			this.rendasAuferidas.remove(this.rendasAuferidas.indexOf(renda));
		}
	}
	public double somaRendas() {
		double soma = 0;
		for(int i = 0; i < rendasAuferidas.size(); i++) {
			soma += rendasAuferidas.get(i);
		}
		return soma;
	}
}
