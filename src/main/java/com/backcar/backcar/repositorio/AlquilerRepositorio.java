package com.backcar.backcar.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backcar.backcar.modelo.Alquiler;



public interface AlquilerRepositorio  extends JpaRepository<Alquiler, Long> {
    public Alquiler findByAlquiler(Long alquiler);
}
