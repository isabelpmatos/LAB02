package com.adc.models;

public class Contrato {
	private int id;
	private PedidoDeAluguel pedido;
	
	public Contrato() {
		
	}

	public Contrato(int id, PedidoDeAluguel pedido) {
		super();
		this.id = id;
		this.pedido = pedido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PedidoDeAluguel getPedido() {
		return pedido;
	}

	public void setPedido(PedidoDeAluguel pedido) {
		this.pedido = pedido;
	}
	
}
