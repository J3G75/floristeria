package com.floristeria.controller;

import com.floristeria.entity.Producto;
import com.floristeria.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/productos")

public class ProductoController {
    @Autowired
    private ProductoService productoService;


    @GetMapping
    public List<Producto>getAll(){
        return productoService.getProductos();

    }

    @GetMapping("/{productoId}")
    public Optional<Producto> getById(@PathVariable("productoId") Long productoId){
        return productoService.getProducto(productoId);

    }

    @PostMapping
    public void saveOrUpdate(@RequestBody Producto producto){
        productoService.saveOrUpdate(producto);
    }

    @DeleteMapping("/{productoId}")
    public void delete(@PathVariable("productoId") Long productoId){
        productoService.delete(productoId);

    }
}
