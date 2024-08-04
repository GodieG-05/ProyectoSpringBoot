package com.campuslands.proyectospringboot.Pago.domain.entities;

import java.security.Timestamp;

import com.campuslands.proyectospringboot.Cliente.domain.entities.Cliente;
import com.campuslands.proyectospringboot.FormaPago.domain.entities.FormaPago;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer transaccion;

    @ManyToOne
    @JoinColumn(name = "forma_pago_pago")
    private FormaPago formaPago;

    @Column (name = "fecha_pago")
    Timestamp fechaPago;

    @ManyToOne
    @JoinColumn(name = "pago_cliente")
    private Cliente pagoCliente;
}
