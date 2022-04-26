package com.jmcorp.back_jmcorp.controller;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TTaller;
import com.jmcorp.back_jmcorp.service.TallerService;

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
public class TallerController {

    @Autowired
    TallerService tallerService;

    @GetMapping("/listarTaller")
    public List<TTaller> listarTaller() {
        return tallerService.listarTaller();
    }

    @GetMapping("/listarTallerPorId")
    public ResponseEntity<TTaller> listarId(@RequestParam("id_taller") Long id_taller) {

        return ResponseEntity.ok(tallerService.listarPorIdTaller(id_taller));

    }

    @PostMapping("/crearTaller")
    @ResponseBody
    public TTaller crearTaller(@RequestBody TTaller taller) {
        return this.tallerService.crearTaller(taller);
    }

    @DeleteMapping(value = "/eliminarTaller/{id_taller}")
    public void eliminarTaller(@PathVariable Long id_taller) {
        try {
            tallerService.eliminarTaller(id_taller);
        } catch (Exception e) {
            System.out.println("Error al eliminar la taller");
        }
    }

    @PutMapping("/actualizarTaller/{id_taller}")
    public TTaller actualizarTaller(@RequestBody TTaller taller) {
        TTaller actualizarTaller = tallerService.actualizarTaller(taller.getId_taller());
        actualizarTaller.setNombre_taller(taller.getNombre_taller());
        actualizarTaller.setEstado_taller(taller.getEstado_taller());
        tallerService.crearTaller(actualizarTaller);
        return actualizarTaller;
    }
}
