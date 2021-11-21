package com.fantasytextil.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tela {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTela;
	
	@Column(name = "rolor")
	private String color;
	
	@Column(name = "estilo")
	private String estilo;
	
	@Column(name = "peso")
	private double peso;

	public Integer getIdTela() {
		return idTela;
	}

	public void setIdTela(Integer idTela) {
		this.idTela = idTela;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Tela [idTela=" + idTela + ", color=" + color + ", estilo=" + estilo + ", peso=" + peso + "]";
	}
	
	
	
}
