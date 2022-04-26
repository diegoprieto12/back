package com.jmcorp.back_jmcorp.controller;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TProductoBodega;
import com.jmcorp.back_jmcorp.service.ProductoBodegaService;

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
public class ProductoBodegaController {

    @Autowired
    ProductoBodegaService productoBodegaService;

    @GetMapping("/listarProductoBodega")
    public List<TProductoBodega> listarProductoBodega() {
        return productoBodegaService.listarProductoBodega();
    }

    @GetMapping("/listarProductoBodegaPorId")
    public ResponseEntity<TProductoBodega> listarId(@RequestParam("id_articulo_bodega") Long id_articulo_bodega) {

        return ResponseEntity.ok(productoBodegaService.listarPorIdProductoBodega(id_articulo_bodega));

    }

    @PostMapping("/crearProductoBodega")
    @ResponseBody
    public TProductoBodega crearProductoBodega(@RequestBody TProductoBodega productoBodega) {
        return this.productoBodegaService.crearProductoBodega(productoBodega);
    }

    @DeleteMapping(value = "/eliminarProductoBodega/{id_articulo_bodega}")
    public void eliminarProductoBodega(@PathVariable Long id_articulo_bodega) {
        try {
            productoBodegaService.eliminarProductoBodega(id_articulo_bodega);
        } catch (Exception e) {
            System.out.println("Error al eliminar la productoBodega");
        }
    }

    @PutMapping("/actualizarProductoBodega/{id_articulo_bodega}")
    public TProductoBodega actualizarProductoBodega(@RequestBody TProductoBodega productoBodega) {
        TProductoBodega actualizarProductoBodega = productoBodegaService.actualizarProductoBodega(productoBodega.getId_articulo_bodega());
        actualizarProductoBodega.setProveedor(productoBodega.getProveedor());
        actualizarProductoBodega.setFecha(productoBodega.getFecha());
        actualizarProductoBodega.setSubtotal(productoBodega.getSubtotal());
        actualizarProductoBodega.setIva(productoBodega.getIva());
        actualizarProductoBodega.setValor_total(productoBodega.getValor_total());
        actualizarProductoBodega.setCodigo_fact(productoBodega.getCodigo_fact());
        actualizarProductoBodega.setTipo_ArtBodega(productoBodega.getTipo_ArtBodega());
        //actualizarProductoBodega.setStock_articulo_bodega(productoBodega.getStock_articulo_bodega());
        //actualizarProductoBodega.setStock_deteriorado_articulo_bodega(productoBodega.getStock_deteriorado_articulo_bodega());
        productoBodegaService.crearProductoBodega(actualizarProductoBodega);
        return actualizarProductoBodega;
    }
}