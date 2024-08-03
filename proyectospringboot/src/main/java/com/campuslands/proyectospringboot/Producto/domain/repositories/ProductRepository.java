package com.campuslands.proyectospringboot.Producto.domain.repositories;

import org.springframework.data.repository.CrudRepository;
import com.campuslands.proyectospringboot.Producto.domain.entities.Producto;

public interface ProductRepository extends CrudRepository<Producto,Long>{

}
