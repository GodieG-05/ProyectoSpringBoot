package com.campuslands.proyectospringboot.Pago.infrastructure.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campuslands.proyectospringboot.Pago.domain.entities.Pago;

public interface PagoRepository extends JpaRepository<Pago,Long>{

}
