package com.backcar.backcar.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="devolucion")
@Getter
@Setter
public class Devolucion implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
        @Column(name="cod_dv",length = 8)
        private Long cod_dv;
	
	private Date fecha_dv;
	@Column(name="lugar_dv", nullable=false, length = 45, unique=false)
	private String lugar_dv;
	 
        
        public Long getCod_dv() {
		return cod_dv;
	}


	public void setCod_dv(Long cod_dv) {
		this.cod_dv = cod_dv;
	}


	public Date getFecha_dv() {
		return fecha_dv;
	}


	public void setFecha_dv(Date fecha_dv) {
		this.fecha_dv = fecha_dv;
	}


	public String getLugar_dv() {
		return lugar_dv;
	}


	public void setLugar_dv(String lugar_dv) {
		this.lugar_dv = lugar_dv;
	}


	public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


		@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
	private Persona persona;
        
}
