package com.jmcorp.back_jmcorp.controller;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TBodega;
import com.jmcorp.back_jmcorp.service.BodegaService;

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
public class BodegaController {

    @Autowired
    BodegaService bodegaService;

    @GetMapping("/listarBodega")
    public List<TBodega> listarBodega() {
        return bodegaService.listarBodega();
    }

    @GetMapping("/listarBodegaPorId")
    public ResponseEntity<TBodega> listarBodegaId(@RequestParam("id_bodega") Long id_bodega) {

        return ResponseEntity.ok(bodegaService.listarPorIdBodega(id_bodega));

    }

    @PostMapping("/crearBodega")
    @ResponseBody
    public TBodega crearBodega(@RequestBody TBodega bodega) {
        return this.bodegaService.crearBodega(bodega);
    }

    @DeleteMapping(value = "/eliminarBodega/{id_bodega}")
    public void eliminarBodega(@PathVariable Long id_bodega) {
        try {
            bodegaService.eliminarBodega(id_bodega);
        } catch (Exception e) {
            System.out.println("Error al eliminar la bodega");
        }
    }

    @PutMapping("/actualizarBodega/{id_bodega}")
    public TBodega actualizarBodega(@RequestBody TBodega bodega) {
        TBodega actualizarBodega = bodegaService.actualizarBodega(bodega.getId_bodega());
        actualizarBodega.setNombre_bodega(bodega.getNombre_bodega());
        actualizarBodega.setEstado_bodega(bodega.getEstado_bodega());
        bodegaService.crearBodega(actualizarBodega);
        return actualizarBodega;
    }
}