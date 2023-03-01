package com.backcar.backcar.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="comprobante")
@Getter
@Setter
public class Comprobante implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_comp", length = 8)
        private Long cod_comp;
	@Column(name="descripcion", nullable=false, length = 45, unique=false)
	private String descripcion;
	@Column(name="precio", nullable=false, unique=false)
	private Double precio;

	
	
        public Long getCod_comp() {
		return cod_comp;
	}



	public void setCod_comp(Long cod_comp) {
		this.cod_comp = cod_comp;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public Double getPrecio() {
		return precio;
	}



	public void setPrecio(Double precio) {
		this.precio = precio;
	}



	public Alquiler getAlquiler() {
		return alquiler;
	}



	public void setAlquiler(Alquiler alquiler) {
		this.alquiler = alquiler;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



		@JsonIgnore
	@OneToOne(mappedBy="comprobante")
	private Alquiler alquiler;
}
