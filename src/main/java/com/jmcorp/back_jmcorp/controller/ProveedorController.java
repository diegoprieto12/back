package com.jmcorp.back_jmcorp.controller;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TProveedor;
import com.jmcorp.back_jmcorp.service.ProveedorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProveedorController {

    @Autowired
    ProveedorService proveedorService;

    @GetMapping("/listarProveedor")
    public List<TProveedor> listarProveedor() {
        return proveedorService.listarProveedor();
    }

    @GetMapping("/listarProveedorPorId")
    public TProveedor listarProveedorPorId(@RequestParam("id_proveedor") Long id_proveedor) {
        TProveedor proveedor = proveedorService.listarPorIdProveedor(id_proveedor);
        if (proveedor != null) {
            return proveedor;
        }
        return new TProveedor();
    }

    @PostMapping("/crearProveedor")
    @ResponseBody
    public TProveedor crearProveedor(@RequestBody TProveedor proveedor) {
        return this.proveedorService.crearProveedor(proveedor);
    }

    @DeleteMapping(value = "/eliminarProveedor/{id_proveedor}")
    public void eliminarProveedor(@PathVariable Long id_proveedor) {
        try {
            proveedorService.eliminarProveedor(id_proveedor);
        } catch (Exception e) {
            System.out.println("Error al eliminar el proveedor");
        }
    }

    @PutMapping("/actualizarProveedor")
    public TProveedor actualizarProveedor(@RequestBody TProveedor proveedor) {
        TProveedor actualizarProveedor = proveedorService.actualizarProveedor(proveedor.getId_proveedor());
        actualizarProveedor.setPersona(proveedor.getPersona());
        actualizarProveedor.setNombre_empresa_proveedor(proveedor.getNombre_empresa_proveedor());
        proveedorService.crearProveedor(actualizarProveedor);
        return actualizarProveedor;
    }
}
