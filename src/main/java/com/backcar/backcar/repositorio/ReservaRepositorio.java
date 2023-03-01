package com.backcar.backcar.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backcar.backcar.modelo.Reserva;



public interface ReservaRepositorio extends JpaRepository<Reserva, Long> {
    public Reserva findByReserva(Long reserva);
}