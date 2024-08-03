package com.campuslands.proyectospringboot.Producto.infrastructure.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import com.campuslands.proyectospringboot.Producto.domain.entities.Producto;

public interface ProductRepository extends JpaRepository<Producto,Long>{

}
