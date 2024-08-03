package com.campuslands.proyectospringboot.Pedido.application.services;

import java.util.List;
import java.util.Optional;
import com.campuslands.proyectospringboot.Pedido.domain.entities.Pedido;

public interface PedidoService {
    List<Pedido> findAll();
    Optional<Pedido> findById(Long id);
    Pedido save(Pedido pedido);
    Optional<Pedido> update(Long id, Pedido pedido);
    Optional<Pedido> delete(Long id);
}
