package com.fantasytextil.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class PedidoCortadorPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "id_pedido", nullable = false)
	private Pedido pedido;
	
	@ManyToOne
	@JoinColumn(name = "id_cortador", nullable = false)
	private Cortador cortador;

	@Override
	public int hashCode() {
		return Objects.hash(cortador, pedido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PedidoCortadorPK other = (PedidoCortadorPK) obj;
		return Objects.equals(cortador, other.cortador) && Objects.equals(pedido, other.pedido);
	}

	
	
}
