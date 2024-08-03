package com.campuslands.proyectospringboot.Producto.application.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.campuslands.proyectospringboot.Producto.domain.entities.Producto;
import com.campuslands.proyectospringboot.Producto.infrastructure.out.persistence.ProductRepository;

@Service
public class ProductImpl implements ProductoService{

    @Autowired
    private ProductRepository repository;

    @Transactional
    @Override
    public List<Producto> findAll() {
        return (List<Producto>) repository.findAll();
    }

    @Transactional
    @Override
    public Optional<Producto> findById(Long id) {
        return repository.findById(id);
    }

    @Transactional
    @Override
    public Producto save(Producto product) {
        return repository.save(product);
    }

    @Transactional
    @Override
    public Optional<Producto> delete(Long id) {
        Optional<Producto> productOpt = repository.findById(id);
        productOpt.ifPresent(pI -> {
            repository.delete(pI);
        });
        return productOpt;
    }

    @Override
    public Optional<Producto> update(Long id, Producto product) {
        Optional<Producto> productOpt = repository.findById(id);
        if (productOpt.isPresent()) {
            Producto productItem = productOpt.orElseThrow();
            productItem.setNombreProducto(product.getNombreProducto());
            productItem.setNombreProducto(product.getNombreProducto());
            productItem.setPrecioProveedor(product.getPrecioProveedor());
            productItem.setPrecioVenta(product.getPrecioVenta());
            productItem.setGamaProducto(product.getGamaProducto());
            productItem.setDimensionesProducto(product.getDimensionesProducto());
            productItem.setProveedorProducto(product.getProveedorProducto());
            productItem.setStockProducto(product.getStockProducto());
            return Optional.of(repository.save(productItem));
        }
        return productOpt;
    }

}
