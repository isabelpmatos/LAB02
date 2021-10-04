package com.example.models;

import javax.persistence.*;

@Entity
@Table(name="automoveis")
public class Automovel {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(nullable = false, length = 4)
	private int ano;
	@Column(nullable = false, length = 20)
	private int matricula;
	@Column(nullable = false, length = 20)
	private String marca;
	@Column(nullable = false, unique = true, length = 7)
	private String placa;
	@Column(nullable = false)
	private double preco;
	
	public Automovel(Long id, int ano, int matricula, String marca, String placa, double preco) {
		super();
		this.id = id;
		this.ano = ano;
		this.matricula = matricula;
		this.marca = marca;
		this.placa = placa;
		this.preco = preco;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	
	public void updatePreco(double preco) {
		this.preco = preco;
	}
}
