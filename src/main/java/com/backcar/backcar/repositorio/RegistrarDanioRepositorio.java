package com.backcar.backcar.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backcar.backcar.modelo.RegistrarDanio;


public interface RegistrarDanioRepositorio extends JpaRepository<RegistrarDanio, Long> {
    public RegistrarDanio findByRegistrarDanio(Long registrarDanio);
}
