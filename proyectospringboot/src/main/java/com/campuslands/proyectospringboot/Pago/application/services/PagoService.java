package com.campuslands.proyectospringboot.Pago.application.services;

import java.util.List;
import java.util.Optional;

import com.campuslands.proyectospringboot.Pago.domain.entities.Pago;

public interface PagoService {
    List<Pago> findAll();
    Optional<Pago> findById(Long id);
    Pago save(Pago pago);
    Optional<Pago> update(Long id, Pago pago);
    Optional<Pago> delete(Long id);
}
