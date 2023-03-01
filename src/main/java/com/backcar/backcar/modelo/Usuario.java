package com.backcar.backcar.modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "usuarios")
public class Usuario implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
	@Column(name="nombre", nullable=false, length = 45, unique=false)
	private String user;
	private String password;
	
	   public Usuario(Long id, String user, String password) {
			super();
			this.id= id;
			this.user = user;
			this.password = password;
			//this.roles = roles;
		}
	   
	   public Usuario(String user, String password, Collection<Rol> roles) {
           super();
	    this.user = user;
           this.password = password;
           //this.roles = roles;
	}

	public Usuario() {
		
	}
       
       @JsonIgnore
	@OneToMany(mappedBy="usuarios")
	private List<Automovil> automovil;

       @JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
	private Persona persona;
       
       @JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_rol", referencedColumnName = "id")
	private Rol rol;

       @JsonIgnore
	@OneToMany(mappedBy="usuarios")
	private List<Alquiler> alquiler;

       @JsonIgnore
	@OneToMany(mappedBy="usuarios")
	private List<Persona> personas;

		
}
