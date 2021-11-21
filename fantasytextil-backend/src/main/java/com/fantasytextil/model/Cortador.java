package com.fantasytextil.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cortador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCortador;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "telefono")
	private String telefono;

	public Integer getIdCortador() {
		return idCortador;
	}

	public void setIdCortador(Integer idCortador) {
		this.idCortador = idCortador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Cortador [idCortador=" + idCortador + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono="
				+ telefono + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCortador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cortador other = (Cortador) obj;
		return Objects.equals(idCortador, other.idCortador);
	}


	
	
	
}
