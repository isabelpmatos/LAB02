package com.adc.models;

public class Automovel {
	private int ano;
	private int matricula;
	private String marca;
	private String modelo;
	private String placa;
	private double preco;
	
	public Automovel() {
		
	}
	
	public Automovel(int ano, int matricula, String marca, String modelo, String placa, double preco) {
		super();
		this.ano = ano;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.preco = preco;
	}

	public void updatePreco(double novoPreco) {
		this.setPreco(novoPreco);
	}
	
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}