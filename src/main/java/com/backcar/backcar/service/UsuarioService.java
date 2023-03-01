package com.backcar.backcar.service;

import java.util.List;



import com.backcar.backcar.modelo.Usuario;



public interface UsuarioService {

	 public List<Usuario> findAll();
	    
	    public Usuario save(Usuario usuario);
	    
	   public Usuario findById(Long id);
	   
	   public void delete(Long id);
}
