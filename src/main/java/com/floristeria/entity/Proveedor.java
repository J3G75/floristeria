package com.floristeria.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "tbl_proveedor")

public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProveedor;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    @OneToMany(mappedBy = "proveedor")
    List<Producto>productos;

}
