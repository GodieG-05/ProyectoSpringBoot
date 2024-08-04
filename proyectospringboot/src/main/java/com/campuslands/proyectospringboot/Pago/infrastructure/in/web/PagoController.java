package com.campuslands.proyectospringboot.Pago.infrastructure.in.web;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campuslands.proyectospringboot.Pago.application.services.PagoService;
import com.campuslands.proyectospringboot.Pago.domain.entities.Pago;

@RestController
@RequestMapping("/pagos")
public class PagoController {

    private final PagoService pagoService;

    public PagoController(PagoService pagoService) {
        this.pagoService = pagoService;
    }

    @GetMapping
    public List<Pago> encontrarPagos() {
        return pagoService.findAll();
    }

    @PostMapping
    public Pago crearPago(@RequestBody Pago pago) {
        return pagoService.save(pago);
    }

    @PutMapping("/{id}")
        public Optional<Pago> actualizarPago(@PathVariable Long id, @RequestBody Pago pago) {
            pago.setId(id);
        return pagoService.update(id, pago);  
    }

    @DeleteMapping("/{id}")
    public void eliminarPago(@PathVariable Long id) {
        pagoService.delete(id);
    }
}
