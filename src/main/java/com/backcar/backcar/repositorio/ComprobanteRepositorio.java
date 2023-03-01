package com.backcar.backcar.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backcar.backcar.modelo.Comprobante;



public interface ComprobanteRepositorio    extends JpaRepository<Comprobante, Long> {
    public Comprobante findByComprobante(Long comprobante);
}
