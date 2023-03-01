package com.backcar.backcar.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backcar.backcar.modelo.Seguro;



public interface SeguroRepositorio  extends JpaRepository<Seguro, Long> {
    public Seguro findBySeguro(Long seguro);
}