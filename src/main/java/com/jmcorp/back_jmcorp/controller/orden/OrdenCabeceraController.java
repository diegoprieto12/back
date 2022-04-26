package com.jmcorp.back_jmcorp.controller.orden;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TOrdenCabecera;
import com.jmcorp.back_jmcorp.service.OrdenCabeceraService;

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
public class OrdenCabeceraController {

    @Autowired
    OrdenCabeceraService ordenCabeceraService;

    @GetMapping("/listarOrdencabecera")
    public List<TOrdenCabecera> listarOrdenCabeceras(){
        return ordenCabeceraService.listarOrdenCabecera();
    }
    
    @GetMapping("/ListarOrdenCabeceraPorId")
    public ResponseEntity <TOrdenCabecera> listarId(@RequestParam("id_orden_cabecera") Long id_orden_cabecera){
        return ResponseEntity.ok(ordenCabeceraService.listarPorIdOrdenCabecera(id_orden_cabecera));
    }
    
    @PostMapping("/crearOrdenCabecera")
    @ResponseBody
    public TOrdenCabecera crearOrdenCabecera(@RequestBody TOrdenCabecera ordencabecera) {
        return this.ordenCabeceraService.crearOrdenCabecera(ordencabecera);
    }

    @DeleteMapping(value = "/eliminarOrdenCab/{id_orden_cabecera}")
    public void eliminarOrdenCab(@PathVariable Long id_orden_cabecera) {
        try {
            ordenCabeceraService.eliminarOrdenCabecera(id_orden_cabecera);
        } catch (Exception e) {
            //System.out.println("Error al eliminar la ");
        }
    }

    @PutMapping("/actualizarOrdenCabecera/{id_orden_cabecera}")
    public TOrdenCabecera actualizarOrden(@RequestBody TOrdenCabecera ordenCab) {
        TOrdenCabecera actualizarOrdenCabecera = ordenCabeceraService.actualizarOrdenCabecera(ordenCab.getId_orden_cabecera());
        actualizarOrdenCabecera.setEmpresa(ordenCab.getEmpresa());
        actualizarOrdenCabecera.setCliente(ordenCab.getCliente());
        actualizarOrdenCabecera.setUsuario(ordenCab.getUsuario());
        actualizarOrdenCabecera.setOrdencuerpo(ordenCab.getOrdencuerpo());
        actualizarOrdenCabecera.setObservacion(ordenCab.getObservacion());
        actualizarOrdenCabecera.setFecha(ordenCab.getFecha());
        actualizarOrdenCabecera.setFechaentrega(ordenCab.getFechaentrega());
        actualizarOrdenCabecera.setFechafin(ordenCab.getFechafin());
        actualizarOrdenCabecera.setFechainicio(ordenCab.getFechainicio());
        actualizarOrdenCabecera.setSecuencia(ordenCab.getSecuencia());
        actualizarOrdenCabecera.setDestinatario(ordenCab.getDestinatario());
        ordenCabeceraService.crearOrdenCabecera(actualizarOrdenCabecera);
        return actualizarOrdenCabecera;
    }
}
