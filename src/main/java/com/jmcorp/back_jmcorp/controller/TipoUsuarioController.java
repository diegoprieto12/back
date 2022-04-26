package com.jmcorp.back_jmcorp.controller;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TTipoUsuario;
import com.jmcorp.back_jmcorp.service.TipoUsuarioService;

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
public class TipoUsuarioController {

    @Autowired
    TipoUsuarioService tipoUsuarioService;

    @GetMapping("/listarTipoUsuario")
    public List<TTipoUsuario> listarTipoUsuario() {
        return tipoUsuarioService.listarTipoUsuario();
    }

    @GetMapping("/listarTipoUsuarioPorId")
    public ResponseEntity<TTipoUsuario> listarId(@RequestParam("id_t_usuario") Long id_t_usuario) {
        // TTipoUsuario persona = tipoUsuarioService.listarPorIdPersona(id_persona);

        return ResponseEntity.ok(tipoUsuarioService.listarPorIdTipoUsuario(id_t_usuario));

    }

    @PostMapping("/crearTipoUsuario")
    @ResponseBody
    public TTipoUsuario crearPersona(@RequestBody TTipoUsuario tipoUsuario) {
        return this.tipoUsuarioService.crearTipoUsuario(tipoUsuario);
    }

    @DeleteMapping(value = "/eliminarTipoUsuario/{id_t_usuario}")
    public void eliminarPersona(@PathVariable Long id_t_usuario) {
        try {
            tipoUsuarioService.eliminarTipoUsuario(id_t_usuario);
        } catch (Exception e) {
            System.out.println("Error al eliminar el usuario");
        }
    }

    @PutMapping("/actualizarTipoUsuario/{id_t_usuario}")
    public TTipoUsuario actualizarTipoUsuario(@RequestBody TTipoUsuario tipoUsuario) {
        TTipoUsuario actualizarTipoUsuario = tipoUsuarioService.actualizarTipoUsuario(tipoUsuario.getId_t_usuario());
        actualizarTipoUsuario.setNombre_t_usuario(tipoUsuario.getNombre_t_usuario());
        tipoUsuarioService.crearTipoUsuario(actualizarTipoUsuario);
        return actualizarTipoUsuario;
    }

}