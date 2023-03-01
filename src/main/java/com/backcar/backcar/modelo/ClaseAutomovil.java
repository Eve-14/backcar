package com.backcar.backcar.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="claseautomovil")
@Getter
@Setter

public class ClaseAutomovil implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_clase",length = 8)
    private Long id_clase;
    @Column(name="nombre_clase", nullable=false, length = 50, unique=false)
    private String nombre_clase;
        
    @Column(name="precio_alquiler_dia", nullable=false, unique=false)
    private double precio_alquiler_dia;
    
    
    
    public Long getId_clase() {
		return id_clase;
	}



	public void setId_clase(Long id_clase) {
		this.id_clase = id_clase;
	}



	public String getNombre_clase() {
		return nombre_clase;
	}



	public void setNombre_clase(String nombre_clase) {
		this.nombre_clase = nombre_clase;
	}



	public double getPrecio_alquiler_dia() {
		return precio_alquiler_dia;
	}



	public void setPrecio_alquiler_dia(double precio_alquiler_dia) {
		this.precio_alquiler_dia = precio_alquiler_dia;
	}



	public List<Automovil> getAutomovil() {
		return automovil;
	}



	public void setAutomovil(List<Automovil> automovil) {
		this.automovil = automovil;
	}



	@JsonIgnore
    @OneToMany(mappedBy="claseAutomovil")
    private List<Automovil> automovil;

    
}

