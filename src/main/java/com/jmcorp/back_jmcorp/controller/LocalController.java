package com.jmcorp.back_jmcorp.controller;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TLocal;
import com.jmcorp.back_jmcorp.service.LocalService;

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
public class LocalController {
    @Autowired
    LocalService localService;

    @GetMapping("/listarLocal")
    public List<TLocal> listarLocal() {
        return localService.listarLocal();
    }

    @GetMapping("/listarLocalPorId")
    public ResponseEntity<TLocal> listarId(@RequestParam("id_local") Long id_local) {

        return ResponseEntity.ok(localService.listarPorIdLocal(id_local));

    }

    @PostMapping("/crearLocal")
    @ResponseBody
    public TLocal crearLocal(@RequestBody TLocal local) {
        return this.localService.crearLocal(local);
    }

    @DeleteMapping(value = "/eliminarLocal/{id_local}")
    public void eliminarLocal(@PathVariable Long id_local) {
        try {
            localService.eliminarLocal(id_local);
        } catch (Exception e) {
            System.out.println("Error al eliminar el Local");
        }
    }

    @PutMapping("/actualizarLocal/{id_local}")
    public TLocal actualizarLocal(@RequestBody TLocal local) {
        TLocal actualizarLocal = localService.actualizarLocal(local.getId_local());
        actualizarLocal.setNombre_local(local.getNombre_local());
        actualizarLocal.setEstado_local(local.getEstado_local());
        localService.crearLocal(actualizarLocal);
        return actualizarLocal;
    }
}