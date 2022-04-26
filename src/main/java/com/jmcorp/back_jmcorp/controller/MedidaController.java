package com.jmcorp.back_jmcorp.controller;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TMedida;
import com.jmcorp.back_jmcorp.service.MedidaService;

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
public class MedidaController {

    @Autowired
    MedidaService medidaService;

    @GetMapping("/listarMedida")
    public List<TMedida> listarMedida() {
        return medidaService.listarMedida();
    }

    @GetMapping("/listarMedidaPorId")
    public ResponseEntity<TMedida> listarId(@RequestParam("id_medida") Long id_medida) {

        return ResponseEntity.ok(medidaService.listarPorIdMedida(id_medida));

    }

    @PostMapping("/crearMedida")
    @ResponseBody
    public TMedida crearMedida(@RequestBody TMedida medida) {
        return this.medidaService.crearMedida(medida);
    }

    @DeleteMapping(value = "/eliminarMedida/{id_medida}")
    public void eliminarmedida(@PathVariable Long id_medida) {
        try {
            medidaService.eliminarMedida(id_medida);
        } catch (Exception e) {
            System.out.println("Error al eliminar la medida");
        }
    }

    @PutMapping("/actualizarMedida/{id_medida}")
    public TMedida actualizarMedida(@RequestBody TMedida medida) {
        TMedida actualizarMedida = medidaService.actualizarMedida(medida.getId_medida());
        actualizarMedida.setNombre_medida(medida.getNombre_medida());
        medidaService.crearMedida(actualizarMedida);
        return actualizarMedida;
    }
}