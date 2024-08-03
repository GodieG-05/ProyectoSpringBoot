package com.campuslands.proyectospringboot.Pedido.domain.entities;

import java.security.Timestamp;

import com.campuslands.proyectospringboot.Cliente.domain.entities.Cliente;
import com.campuslands.proyectospringboot.DetallePedido.domain.entities.DetallePedido;
import com.campuslands.proyectospringboot.Estado.domain.entities.Estado;

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
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "fecha_pedido")
    private Timestamp fechaPedido;
    @Column (name = "fecha_esperada")
    private Timestamp fechaEsperada;
    @Column (name = "fecha_entrega")
    private Timestamp fechaEntrega;
    private String comentarios;

    @ManyToOne
    @JoinColumn(name = "cliente_pedido")
    private Cliente clientePedido;

    @ManyToOne
    @JoinColumn(name = "estado_pedido")
    private Estado estadoPedido;

    @ManyToOne
    @JoinColumn(name = "detalle_pedido")
    private DetallePedido detallePedido;


}

