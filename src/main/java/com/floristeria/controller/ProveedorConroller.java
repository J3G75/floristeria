package com.floristeria.controller;

import com.floristeria.entity.Proveedor;
import com.floristeria.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/proveedores")

public class ProveedorConroller {
    @Autowired
    ProveedorService proveedorService;
    @GetMapping
    public List<Proveedor> getAll(){
        return proveedorService.getProveedores();

    }

    @GetMapping("/{proveedorId}")
    public Optional<Proveedor> getById(@PathVariable("proveedorId") Long proveedorId){
        return proveedorService.getProveedor(proveedorId);

    }

    @PostMapping
    public void saveOrUpdate(@RequestBody Proveedor proveedor){
        proveedorService.saveOrUpdate(proveedor);
    }

    @DeleteMapping("/{proveedorId}")
    public void delete(@PathVariable("proveedorId") Long proveedorId){
        proveedorService.delete(proveedorId);

    }
}
