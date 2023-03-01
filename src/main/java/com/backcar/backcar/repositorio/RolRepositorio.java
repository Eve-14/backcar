package com.backcar.backcar.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backcar.backcar.modelo.Rol;



public interface RolRepositorio extends JpaRepository<Rol, Long> {
    public Rol findByRol(Long rol);
}
