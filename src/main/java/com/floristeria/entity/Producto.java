package com.floristeria.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="tblProducto")

public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;
    private String nomProducto;
    private String colorProducto;
    private Long costoProducto;
    private Long pvProducto;
    @ManyToOne()
    @JoinColumn(name = "idProveedor")
    private Proveedor proveedor;
}
