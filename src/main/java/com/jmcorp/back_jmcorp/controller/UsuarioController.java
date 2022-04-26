package com.jmcorp.back_jmcorp.controller;

import java.util.List;

import com.jmcorp.back_jmcorp.auth.GenerarToken;
import com.jmcorp.back_jmcorp.model.TUsuario;
import com.jmcorp.back_jmcorp.service.UsuarioService;

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
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/listarUsuario")
    public List<TUsuario> listarUsuario() {
        return usuarioService.listarUsuario();
    }

    @GetMapping("/listarUsuarioPorId")
    public TUsuario listarUsuarioPorId(@RequestParam("id_usuario") Long id_usuario) {
        TUsuario usuario = usuarioService.listarPorIdUsuario(id_usuario);
        if (usuario != null) {
            return usuario;
        }
        return new TUsuario();
    }

    @PostMapping("/crearUsuario")
    @ResponseBody
    public TUsuario crearUsuario(@RequestBody TUsuario usuario) {
        return this.usuarioService.crearUsuario(usuario);
    }

    @DeleteMapping(value = "/eliminarUsuario/{id_usuario}")
    public void eliminarUsuario(@PathVariable Long id_usuario) {
        try {
            usuarioService.eliminarUsuario(id_usuario);
        } catch (Exception e) {
            System.out.println("Error al eliminar el usuario");
        }
    }

    @PutMapping("/actualizarUsuario/{id_usuario}")
    public TUsuario actualizarUsuario(@RequestBody TUsuario usuario) {
        TUsuario actualizarUsuario = usuarioService.actualizarUsuario(usuario.getId_usuario());
        actualizarUsuario.setNombre_usuario(usuario.getNombre_usuario());
        actualizarUsuario.setPass_usuario(usuario.getPass_usuario());
        actualizarUsuario.setEstado_usuario(usuario.getEstado_usuario());
        actualizarUsuario.setAcceso_usuario(usuario.getAcceso_usuario());
        usuarioService.crearUsuario(actualizarUsuario);
        return actualizarUsuario;
    }

    @PutMapping("/actualizarToken")
    public TUsuario actualizarToken(@RequestBody TUsuario usuario) {
        TUsuario actualizarUsuario = usuarioService.actualizarUsuario(usuario.getId_usuario());
        actualizarUsuario.setToken_usuario(GenerarToken.getJwtToken(usuario.getNombre_usuario()));
        usuarioService.crearUsuario(actualizarUsuario);
        return actualizarUsuario;
    }
}
