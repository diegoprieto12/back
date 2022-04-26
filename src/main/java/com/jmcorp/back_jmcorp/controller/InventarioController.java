package com.jmcorp.back_jmcorp.controller;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TInventario;
import com.jmcorp.back_jmcorp.service.InventarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
public class InventarioController {
    @Autowired
    InventarioService inventarioService;

    @GetMapping("/listarInventario")
    public List<TInventario> listarInventario() {
        return inventarioService.listarInventario();
    }

    @GetMapping("/listarInventarioPorId")
    public ResponseEntity<TInventario> listarId(@RequestParam("id_inventario") Long id_inventario) {

        return ResponseEntity.ok(inventarioService.listarPorIdInventario(id_inventario));

    }

    @PostMapping("/crearInventario")
    @ResponseBody
    public TInventario crearInventario(@RequestBody TInventario inventario) {
        return this.inventarioService.crearInventario(inventario);
    }

    @DeleteMapping(value = "/eliminarInventario/{id_inventario}")
    public void eliminarInventario(@PathVariable Long id_inventario) {
        try {
            inventarioService.eliminarInventario(id_inventario);
        } catch (Exception e) {
            System.out.println("Error al eliminar la inventario");
        }
    }

    @PutMapping("/actualizarInventario/{id_inventario}")
    public TInventario actualizarInventario(@RequestBody TInventario inventario) {
        TInventario actualizarInventario = inventarioService.actualizarInventario(inventario.getId_inventario());
        actualizarInventario.setProductobodega(inventario.getProductobodega());
        actualizarInventario.setArticulos(inventario.getArticulos());
        actualizarInventario.setBodega(inventario.getBodega());
        actualizarInventario.setStock_articulo_bodega(inventario.getStock_articulo_bodega());
        actualizarInventario.setStock_deteriorado_articulo_bodega(inventario.getStock_deteriorado_articulo_bodega());
        inventarioService.crearInventario(actualizarInventario);
        return actualizarInventario;
    }

}