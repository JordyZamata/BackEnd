package com.fantasytextil.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "pedido_cortador")
@IdClass(PedidoCortadorPK.class)
public class PedidoCortador {

	@Id
	private Pedido pedido;
	
	@Id
	private Cortador cortador;

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Cortador getCortador() {
		return cortador;
	}

	public void setCortador(Cortador cortador) {
		this.cortador = cortador;
	}

	@Override
	public String toString() {
		return "PedidoCortador [pedido=" + pedido + ", cortador=" + cortador + "]";
	}
	
	
	
	
}
