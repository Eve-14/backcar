package com.backcar.backcar.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backcar.backcar.modelo.ClaseAutomovil;



public interface ClaseAutomovilRepositorio   extends JpaRepository<ClaseAutomovil, Long> {
    public ClaseAutomovil findByClaseAuto(Long alquiler);
}