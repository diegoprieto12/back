package com.jmcorp.back_jmcorp.controller;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TEnvios;
import com.jmcorp.back_jmcorp.service.EnviosService;

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
public class EnviosController {

    @Autowired
    EnviosService enviosService;

    @GetMapping("/listarEnvios")
    public List<TEnvios> listarEnvios() {
        return enviosService.listarEnvios();
    }

    @GetMapping("/listarEnviosPorId/{id_envios}")
    public ResponseEntity<TEnvios> listarId(@RequestParam("id_envios") Long id_envios) {

        return ResponseEntity.ok(enviosService.listarPorIdEnvios(id_envios));

    }

    @PostMapping("/crearEnvios")
    @ResponseBody
    public TEnvios crearEnvios(@RequestBody TEnvios envios) {
        return this.enviosService.crearEnvios(envios);
    }

    @DeleteMapping(value = "/eliminarEnvios/{id_envios}")
    public void eliminarEnvios(@PathVariable Long id_envios) {
        try {
            enviosService.eliminarEnvios(id_envios);
        } catch (Exception e) {
            System.out.println("Error al eliminar los envios");
        }
    }

    @PutMapping("/actualizarEnvios/{id_envios}")
    public TEnvios actualizarEnvios(@RequestBody TEnvios envios) {
        TEnvios actualizarEnvios = enviosService.actualizarEnvios(envios.getId_envios());
        actualizarEnvios.setStock_envios(envios.getStock_envios());
        enviosService.crearEnvios(actualizarEnvios);
        return actualizarEnvios;
    }

}