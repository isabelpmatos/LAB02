package com.example.models;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PedidoDeAluguel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private ArrayList<Automovel> listAutomoveis;
	@OneToOne
	private Cliente cliente;
	@Column(nullable = false)
	private double valorTotal;
	
	public PedidoDeAluguel(int id, ArrayList<Automovel> listAutomoveis, Cliente cliente, double valorTotal) {
		super();
		this.id = id;
		this.listAutomoveis = listAutomoveis;
		this.cliente = cliente;
		this.valorTotal = valorTotal;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Automovel> getListAutomoveis() {
		return listAutomoveis;
	}
	public void setListAutomoveis(ArrayList<Automovel> listAutomoveis) {
		this.listAutomoveis = listAutomoveis;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	private void addAutomovel(Automovel automovel) {
		this.listAutomoveis.add(automovel);
	}
	private void removeAutomovel(Automovel automovel) {
		if(this.listAutomoveis.contains(automovel)) {
			this.listAutomoveis.remove(this.listAutomoveis.indexOf(automovel));
		}
	}
	public String consular() {
		String content = "";
		content = content.concat(Integer.toString(this.id)).concat(", ").concat(this.cliente.getFirstName()).concat(" ").concat(this.cliente.getLastName().concat(", ")).concat(Double.toString(this.getValorTotal()));
		for(int i = 0; i < listAutomoveis.size(); i++) {
			content = content.concat(listAutomoveis.get(i).getPlaca());
		}
		return content;
	}
	public void avaliar() {
		
	}
}
