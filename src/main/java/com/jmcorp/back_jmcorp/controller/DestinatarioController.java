package com.jmcorp.back_jmcorp.controller;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TDestinatario;
import com.jmcorp.back_jmcorp.service.DestinatarioService;

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
public class DestinatarioController {

    @Autowired
    DestinatarioService destinatarioService;

    @GetMapping("/listarDestinatario")
    public List<TDestinatario> listarDestinatario() {
        return destinatarioService.listarDestinatario();
    }

    @GetMapping("/listarDestinatarioPorId/{id_destinatario}")
    public ResponseEntity<TDestinatario> listarId(@RequestParam("id_destinatario") Long id_destinatario) {

        return ResponseEntity.ok(destinatarioService.listarPorIdDestinatario(id_destinatario));

    }

    @PostMapping("/crearDestinatario")
    @ResponseBody
    public TDestinatario crearDestinatario(@RequestBody TDestinatario destinatario) {
        return this.destinatarioService.crearDestinatario(destinatario);
    }

    @DeleteMapping(value = "/eliminarDestinatario/{id_destinatario}")
    public void eliminarDestinatario(@PathVariable Long id_destinatario) {
        try {
            destinatarioService.eliminarDestinatario(id_destinatario);
        } catch (Exception e) {
            System.out.println("Error al eliminar la destinatario");
        }
    }

    @PutMapping("/actualizarDestinatario/{id_destinatario}")
    public TDestinatario actualizarDestinatario(@RequestBody TDestinatario destinatario) {
        TDestinatario actualizarDestinatario = destinatarioService
                .actualizarDestinatario(destinatario.getId_destinatario());
        actualizarDestinatario.setCedula_destinatario(destinatario.getCedula_destinatario());
        actualizarDestinatario.setNombre_destinatario(destinatario.getNombre_destinatario());
        actualizarDestinatario.setApellido_destinatario(destinatario.getApellido_destinatario());
        actualizarDestinatario.setCelular_destinatario(destinatario.getCelular_destinatario());
        actualizarDestinatario.setFecha_destinatario(destinatario.getFecha_destinatario());
        actualizarDestinatario.setHora_destinatario(destinatario.getHora_destinatario());
        destinatarioService.crearDestinatario(actualizarDestinatario);
        return actualizarDestinatario;
    }
}