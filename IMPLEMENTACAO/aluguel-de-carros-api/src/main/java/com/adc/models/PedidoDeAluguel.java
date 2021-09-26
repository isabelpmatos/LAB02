package com.adc.models;

import java.util.ArrayList;
import java.util.List;

public class PedidoDeAluguel {
	private List<Automovel> listAutomoveis = new ArrayList();
	private Cliente cliente;
	private double valorTotal;
	private int id;
	
	public PedidoDeAluguel() {
		
	}
	public PedidoDeAluguel(List<Automovel> listAutomoveis, Cliente cliente, double valorTotal, int id) {
		super();
		this.listAutomoveis = listAutomoveis;
		this.cliente = cliente;
		this.valorTotal = valorTotal;
		this.id = id;
	}
	public void update() {
		
	}
	public void addAutomovel(Automovel automovel) {
		this.listAutomoveis.add(automovel);
	}
	public void removeAutomovel(Automovel automovel) {
		if(this.listAutomoveis.contains(automovel)) {
			this.listAutomoveis.remove(this.listAutomoveis.indexOf(automovel));
		}
	}
	public String consultar() {
		String content ="";
		content = "Cliente: ".concat(cliente.getNome().concat("/n").concat("Valor total: " + Double.toString(valorTotal))).concat("/n").concat("Automóveis: ").concat("/n");
		for(int i = 0; i < listAutomoveis.size(); i++) {
			content = content.concat(listAutomoveis.get(i).getModelo().concat("/n"));
		}
		return content;
	}
	public void avaliar() {
		
	}
	public void gerarContrato() {
		
	}
	public List<Automovel> getListAutomoveis() {
		return listAutomoveis;
	}
	public void setListAutomoveis(List<Automovel> listAutomoveis) {
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}