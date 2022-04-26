package com.jmcorp.back_jmcorp.controller;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TCajaChica;
import com.jmcorp.back_jmcorp.service.CajachicaService;

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
public class CajaChicaController {
    @Autowired
    CajachicaService cajaChicaservice;

    //@Autowired
    TCajaChica CajaChica;
    

    @GetMapping("/listarCajaChica")
    public List<TCajaChica> listarCajaChica() {
        return cajaChicaservice.listarCajaChica();
    }

    @GetMapping("/listarCajaChicaPorId")
    public ResponseEntity<TCajaChica> listarId(@RequestParam("id_CajaChica") Long id_CajaChica) {

        return ResponseEntity.ok(cajaChicaservice.listarPorIdCajaChica(id_CajaChica));

    }

    @PostMapping("/crearCajaChica")
    @ResponseBody
    public TCajaChica crearCajaChica(@RequestBody TCajaChica CajaChica) {
        return this.cajaChicaservice.crearCajaChica(CajaChica);
    }

    @DeleteMapping(value = "/eliminarCajaChica/{id_CajaChica}")
    public void eliminarCajaChica(@PathVariable Long id_CajaChica) {
        try {
            cajaChicaservice.eliminarCajaChica(id_CajaChica);
        } catch (Exception e) {
            System.out.println("Error al eliminar el CajaChica");
        }
    }

    @PutMapping("/actualizarCajaChica/{id_CajaChica}")
    public TCajaChica actualizarCajaChica(@RequestBody TCajaChica CajaChica) {
        TCajaChica actualizarCajaChica = cajaChicaservice.actualizarCajaChica(CajaChica.getId_caja());
        actualizarCajaChica.setDescripcion(CajaChica.getDescripcion());        
        actualizarCajaChica.setIngreso(CajaChica.getIngreso());
        actualizarCajaChica.setFecha(CajaChica.getFecha());
        actualizarCajaChica.setValor_final(CajaChica.getValor_final());
        actualizarCajaChica.setValor_ingreso2(CajaChica.getValor_ingreso2());
        actualizarCajaChica.setDescripcion_ingreso(CajaChica.getDescripcion_ingreso());
        actualizarCajaChica.setNumero_factura(CajaChica.getNumero_factura());
        actualizarCajaChica.setProveedor(CajaChica.getProveedor());
        cajaChicaservice.crearCajaChica(actualizarCajaChica);
        return actualizarCajaChica;
    }
}
