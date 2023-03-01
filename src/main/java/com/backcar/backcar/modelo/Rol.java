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
@Getter
@Setter
@Table(name = "rol")
public class Rol implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable=false, length = 8)
        private Long id;
        
        @Column(name="nombre", nullable=false, length = 20, unique=false)
	private String nombre;
       
	
	public Rol(Long id, String nombre) {
		super();
		this.id= id;
		this.nombre = nombre;
	}

	public Rol() {
		
	}
    public Rol(Long id) {
		super();
		this.id = id;
	}
		@JsonIgnore
	@OneToMany(mappedBy="rol")
	private List<Usuario> usuarios;
	
}
