package com.backcar.backcar.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backcar.backcar.modelo.Automovil;



public interface AutomovilRepositorio   extends JpaRepository<Automovil, Long> {
    public Automovil findByAuto(Long automovil);
}
