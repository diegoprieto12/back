package com.jmcorp.back_jmcorp.controller;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TEmpresa;
import com.jmcorp.back_jmcorp.service.EmpresaService;

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
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

    @GetMapping("/listarEmpresa")
    public List<TEmpresa> listarEmpresa() {
        return empresaService.listarEmpresa();
    }

    @GetMapping("/listarEmpresaPorId")
    public ResponseEntity<TEmpresa> listarPorId(@RequestParam("id_empresa") Long id_empresa) {
        // TEmpresa empresa = empresaService.listarPorIdempresa(id_empresa);

        return ResponseEntity.ok(empresaService.listarPorIdEmpresa(id_empresa));

    }

    @PostMapping("/crearEmpresa")
    @ResponseBody
    public TEmpresa crearempresa(@RequestBody TEmpresa empresa) {
        return this.empresaService.crearEmpresa(empresa);
    }

    @DeleteMapping(value = "/eliminarEmpresa/{id_empresa}")
    public void eliminarempresa(@PathVariable Long id_empresa) {
        try {
            empresaService.eliminarEmpresa(id_empresa);
        } catch (Exception e) {
            System.out.println("Error al eliminar la empresa");
        }
    }

    @PutMapping("/actualizarEmpresa/{id_empresa}")
    public TEmpresa actualizarEmpresa(@RequestBody TEmpresa empresa) {
        TEmpresa actualizarEmpresa = empresaService.actualizarEmpresa(empresa.getId_empresa());
        actualizarEmpresa.setNombre_empresa(empresa.getNombre_empresa());
        actualizarEmpresa.setEstado_empresa(empresa.getEstado_empresa());
        actualizarEmpresa.setDireccion_matriz(empresa.getDireccion_matriz());
        actualizarEmpresa.setDireccion_sucursal(empresa.getDireccion_sucursal());
        actualizarEmpresa.setCelular_empresa(empresa.getCelular_empresa());
        actualizarEmpresa.setEmail_empresa(empresa.getEmail_empresa());
        actualizarEmpresa.setImagen(empresa.getImagen());
        empresaService.crearEmpresa(actualizarEmpresa);
        return actualizarEmpresa;
    }
}