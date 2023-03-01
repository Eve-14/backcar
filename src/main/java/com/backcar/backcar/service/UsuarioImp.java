package com.backcar.backcar.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backcar.backcar.modelo.Usuario;
import com.backcar.backcar.repositorio.UsuarioRepositorio;

@Service
public class UsuarioImp implements UsuarioService{

	@Autowired
	private UsuarioRepositorio ur;
	
	@Override
	@Transactional
	public List<Usuario> findAll() {
		// 
		return (List<Usuario>) ur.findAll();
	}

	@Override
	public Usuario save(Usuario usuario) {
		return ur.save(usuario);
	}

	 @Override
	    @Transactional (readOnly=true)
	    public Usuario findById(Long id) {
	        return ur.findById(id).get();
	    }

	    @Override
	    public void delete(Long id) {
	        ur.deleteById(id);
	    }
}