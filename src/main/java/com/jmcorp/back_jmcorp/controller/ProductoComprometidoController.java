package com.jmcorp.back_jmcorp.controller;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TProductoComprometido;
import com.jmcorp.back_jmcorp.service.ProductoComprometidoService;

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
public class ProductoComprometidoController {

    @Autowired
    ProductoComprometidoService productoComprometidoService;

    @GetMapping("/listarProductoComprometido")
    public List<TProductoComprometido> listarProductoComprometido() {
        return productoComprometidoService.listarProductoComprometido();
    }

    @GetMapping("/listarProductoComprometidoPorId/{id_producto_comprometido}")
    public ResponseEntity<TProductoComprometido> listarId(
            @RequestParam("id_producto_comprometido") Long id_producto_comprometido) {

        return ResponseEntity.ok(productoComprometidoService.listarPorIdProductoComprometido(id_producto_comprometido));

    }

    @PostMapping("/crearProductoComprometido")
    @ResponseBody
    public TProductoComprometido crearProductoComprometido(@RequestBody TProductoComprometido productoComprometido) {
        return this.productoComprometidoService.crearProductoComprometido(productoComprometido);
    }

    @DeleteMapping(value = "/eliminarProductoComprometido/{id_producto_comprometido}")
    public void eliminarProductoComprometido(@PathVariable Long id_producto_comprometido) {
        try {
            productoComprometidoService.eliminarProductoComprometido(id_producto_comprometido);
        } catch (Exception e) {
            System.out.println("Error al eliminar la productoComprometido");
        }
    }

    @PutMapping("/actualizarProductoComprometido/{id_producto_comprometido}")
    public TProductoComprometido actualizarProductoComprometido(
            @RequestBody TProductoComprometido productoComprometido) {
        TProductoComprometido actualizarProductoComprometido = productoComprometidoService
                .actualizarProductoComprometido(productoComprometido.getId_producto_comprometido());
        actualizarProductoComprometido.setProducto(productoComprometido.getProducto());
        productoComprometidoService.crearProductoComprometido(actualizarProductoComprometido);
        return actualizarProductoComprometido;
    }
}