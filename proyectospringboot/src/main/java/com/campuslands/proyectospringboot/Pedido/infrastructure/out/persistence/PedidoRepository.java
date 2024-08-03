package com.campuslands.proyectospringboot.Pedido.infrastructure.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import com.campuslands.proyectospringboot.Pedido.domain.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido,Long>{

}
