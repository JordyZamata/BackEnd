package com.fantasytextil.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Corte {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCorte;
	
	@Column(name = "estilo")
	private String estilo;
	
	@Column(name = "tipo")
	private String tipo;

	public Integer getIdCorte() {
		return idCorte;
	}

	public void setIdCorte(Integer idCorte) {
		this.idCorte = idCorte;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Corte [idCorte=" + idCorte + ", estilo=" + estilo + ", tipo=" + tipo + "]";
	}
	
	
	
}
