package com.fantasytextil.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ForeignKey;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "detalle_pedido")
public class DetallePedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDetalle;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_pedido", nullable = false, foreignKey = @ForeignKey(name = "FK_pedido_detalle"))
	private Pedido pedido;
	
	@ManyToOne
	@JoinColumn(name = "id_corte", nullable = false, foreignKey = @ForeignKey(name = "FK_pedido_detalle_corte"))
	private Corte corte;
	
	@Column(name = "talla_s" )
	private String tallaS;
	
	@Column(name = "talla_m" )
	private String tallaM;
	
	@Column(name = "talla_l" )
	private String tallaL;
	
	@Column(name = "talla_xl" )
	private String tallaXL;
	
	@Column(name = "talla_xs" )
	private String tallaXS;
	
	@Column(name = "talla_1x" )
	private String talla1X;
	
	@Column(name = "talla_2x" )
	private String talla2X;
	
	@Column(name = "talla_4x" )
	private String talla4X;
	
	@Column(name = "total_corte" )
	private String totalCorte;
	
	@Column(name = "ratio_s" )
	private String ratioS;
	
	@Column(name = "ratio_m" )
	private String ratioM;
	
	@Column(name = "ratio_l" )
	private String ratioL;

	@Column(name = "ratio_xs" )
	private String ratioXS;
	
	@Column(name = "ratio_xl" )
	private String ratioXL;
	
	@Column(name = "ratio_1x" )
	private String ratio1X;
	
	@Column(name = "ratio_2x" )
	private String ratio2X;
	
	@Column(name = "ratio_3x" )
	private String ratio3X;
	
	@Column(name = "partida" )
	private String partida;
	
	@Column(name = "proporcion" )
	private String proporcion;
	
	@Column(name = "ancho" )
	private Double ancho;
	
	@Column(name = "paños" )
	private Integer paños;
	
	@Column(name = "largo_paño" )
	private Double lagor_paño;
	
	@Column(name = "peso_paño" )
	private Double peso_paño;
	
	@Column(name = "total_kg" )
	private Double totalKG;

	public Integer getIdDetalle() {
		return idDetalle;
	}

	public void setIdDetalle(Integer idDetalle) {
		this.idDetalle = idDetalle;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Corte getCorte() {
		return corte;
	}

	public void setCorte(Corte corte) {
		this.corte = corte;
	}

	public String getTallaS() {
		return tallaS;
	}

	public void setTallaS(String tallaS) {
		this.tallaS = tallaS;
	}

	public String getTallaM() {
		return tallaM;
	}

	public void setTallaM(String tallaM) {
		this.tallaM = tallaM;
	}

	public String getTallaL() {
		return tallaL;
	}

	public void setTallaL(String tallaL) {
		this.tallaL = tallaL;
	}

	public String getTallaXL() {
		return tallaXL;
	}

	public void setTallaXL(String tallaXL) {
		this.tallaXL = tallaXL;
	}

	public String getTallaXS() {
		return tallaXS;
	}

	public void setTallaXS(String tallaXS) {
		this.tallaXS = tallaXS;
	}

	public String getTalla1X() {
		return talla1X;
	}

	public void setTalla1X(String talla1x) {
		talla1X = talla1x;
	}

	public String getTalla2X() {
		return talla2X;
	}

	public void setTalla2X(String talla2x) {
		talla2X = talla2x;
	}

	public String getTalla4X() {
		return talla4X;
	}

	public void setTalla4X(String talla4x) {
		talla4X = talla4x;
	}

	public String getTotalCorte() {
		return totalCorte;
	}

	public void setTotalCorte(String totalCorte) {
		this.totalCorte = totalCorte;
	}

	public String getRatioS() {
		return ratioS;
	}

	public void setRatioS(String ratioS) {
		this.ratioS = ratioS;
	}

	public String getRatioM() {
		return ratioM;
	}

	public void setRatioM(String ratioM) {
		this.ratioM = ratioM;
	}

	public String getRatioL() {
		return ratioL;
	}

	public void setRatioL(String ratioL) {
		this.ratioL = ratioL;
	}

	public String getRatioXS() {
		return ratioXS;
	}

	public void setRatioXS(String ratioXS) {
		this.ratioXS = ratioXS;
	}

	public String getRatioXL() {
		return ratioXL;
	}

	public void setRatioXL(String ratioXL) {
		this.ratioXL = ratioXL;
	}

	public String getRatio1X() {
		return ratio1X;
	}

	public void setRatio1X(String ratio1x) {
		ratio1X = ratio1x;
	}

	public String getRatio2X() {
		return ratio2X;
	}

	public void setRatio2X(String ratio2x) {
		ratio2X = ratio2x;
	}

	public String getRatio3X() {
		return ratio3X;
	}

	public void setRatio3X(String ratio3x) {
		ratio3X = ratio3x;
	}

	public String getPartida() {
		return partida;
	}

	public void setPartida(String partida) {
		this.partida = partida;
	}

	public String getProporcion() {
		return proporcion;
	}

	public void setProporcion(String proporcion) {
		this.proporcion = proporcion;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public Integer getPaños() {
		return paños;
	}

	public void setPaños(Integer paños) {
		this.paños = paños;
	}

	public Double getLagor_paño() {
		return lagor_paño;
	}

	public void setLagor_paño(Double lagor_paño) {
		this.lagor_paño = lagor_paño;
	}

	public Double getPeso_paño() {
		return peso_paño;
	}

	public void setPeso_paño(Double peso_paño) {
		this.peso_paño = peso_paño;
	}

	public Double getTotalKG() {
		return totalKG;
	}

	public void setTotalKG(Double totalKG) {
		this.totalKG = totalKG;
	}

	@Override
	public String toString() {
		return "DetallePedido [idDetalle=" + idDetalle + ", pedido=" + pedido + ", corte=" + corte + ", tallaS="
				+ tallaS + ", tallaM=" + tallaM + ", tallaL=" + tallaL + ", tallaXL=" + tallaXL + ", tallaXS=" + tallaXS
				+ ", talla1X=" + talla1X + ", talla2X=" + talla2X + ", talla4X=" + talla4X + ", totalCorte="
				+ totalCorte + ", ratioS=" + ratioS + ", ratioM=" + ratioM + ", ratioL=" + ratioL + ", ratioXS="
				+ ratioXS + ", ratioXL=" + ratioXL + ", ratio1X=" + ratio1X + ", ratio2X=" + ratio2X + ", ratio3X="
				+ ratio3X + ", partida=" + partida + ", proporcion=" + proporcion + ", ancho=" + ancho + ", paños="
				+ paños + ", lagor_paño=" + lagor_paño + ", peso_paño=" + peso_paño + ", totalKG=" + totalKG + "]";
	}
	
	
	
	
	
}
