package com.backcar.backcar.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Table(name="persona")
@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public class Persona implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_persona", nullable=false, length = 8)
        
	private Long id_persona;
        
	@Column(name="nombre", nullable=false, length = 45, unique=false)
	private String nombre;
	@Column(name="apellido", nullable=false, length = 45, unique=false)
	private String apellido ;
    @Column(name="cedula", nullable=false, length = 10, unique=false)
	private String cedula ;
    @Column(name="direccion", nullable=false, length = 100, unique=false)
	private String direccion ;
	
	@Column(name="telefono", nullable=false, length = 10, unique=false)
	private String telefono;
	@Column(name="correo", nullable=false, length = 45, unique=true)
	private String correo;
	@Column(name="edad", nullable=false, length = 50, unique=false)
	private int edad;
	@Column(name="usuario", nullable=false, length = 10, unique=true)
	private String usuario;
	@Column(name="contrasenia", nullable=false, length = 15, unique=false)
	private String contrasenia;
	@Column(name="ciudad", nullable=false, length = 20, unique=false)
	private String ciudad;
	@Column(name="genero", nullable=false, length = 20, unique=false)
	private String genero;
	
	
        
    public Long getId_persona() {
		return id_persona;
	}

	public void setId_persona(Long id_persona) {
		this.id_persona = id_persona;
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Usuario getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuario usuarios) {
		this.usuarios = usuarios;
	}

	public List<Usuario> getListausuarios() {
		return listausuarios;
	}

	public void setListausuarios(List<Usuario> listausuarios) {
		this.listausuarios = listausuarios;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id", referencedColumnName = "id")
	private Usuario usuarios;
	
    @JsonIgnore
	@OneToMany(mappedBy="persona")
	private List<Usuario> listausuarios;
        
}
