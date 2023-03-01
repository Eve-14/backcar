package com.backcar.backcar.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backcar.backcar.modelo.Persona;



public interface PersonaRepositorio extends JpaRepository<Persona, Long> {
    public Persona findByPersona(Long persona);
}