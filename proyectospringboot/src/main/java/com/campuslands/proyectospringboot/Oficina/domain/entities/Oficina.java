package com.campuslands.proyectospringboot.Oficina.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table

public class Oficina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "telefono_oficina")
    private Telefono telefono;

    @ManyToOne
    @JoinColumn(name = "ciudad_oficina")
    private Ciudad ciudad;

    @ManyToOne
    @JoinColumn(name = "pais_oficina")
    private Pais pais;

    @OneToOne
    @JoinColumn(name = "codigo_postal_oficina")
    private CodigoPostal codigoPostal;

    @OneToOne
    @JoinColumn(name = "direccion_oficina")
    private Direccion direccion;
}
