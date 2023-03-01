package com.backcar.backcar.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backcar.backcar.modelo.Devolucion;



public interface DevolucionRepositorio   extends JpaRepository<Devolucion, Long> {
    public Devolucion findByDevolucion(Long devolucion);
}