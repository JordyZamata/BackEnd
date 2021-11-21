package com.fantasytextil.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Pedido {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPedido;
	
	@ManyToOne
	@JoinColumn(name = "id_tela", nullable = false, foreignKey = @ForeignKey(name = "FK_pedido_tela"))
	private Tela tela;
	
	
	@ManyToOne
	@JoinColumn(name = "id_cliente", nullable = false, foreignKey = @ForeignKey(name = "FK_pedido_cliente"))
	private Cliente cliente;
	
	@Column(name = "fecha", nullable = false)
	private LocalDateTime fecha;
	
	@OneToMany(mappedBy = "pedido", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<DetallePedido> detallePedido;

	public Integer getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}

	public Tela getTela() {
		return tela;
	}

	public void setTela(Tela tela) {
		this.tela = tela;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public List<DetallePedido> getDetallePedido() {
		return detallePedido;
	}

	public void setDetallePedido(List<DetallePedido> detallePedido) {
		this.detallePedido = detallePedido;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", tela=" + tela + ", cliente=" + cliente + ", fecha=" + fecha
				+ ", detallePedido=" + detallePedido + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idPedido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(idPedido, other.idPedido);
	}

	
	
	
}
