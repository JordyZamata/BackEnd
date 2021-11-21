package com.fantasytextil.dto;

import java.util.List;

import com.fantasytextil.model.Cortador;
import com.fantasytextil.model.Pedido;

public class PedidoListaCortadorDTO {

	private Pedido pedido;
	private List<Cortador> lstCortador;
	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public List<Cortador> getLstCortador() {
		return lstCortador;
	}
	public void setLstCortador(List<Cortador> lstCortador) {
		this.lstCortador = lstCortador;
	}
	
	
	
	
	
}
