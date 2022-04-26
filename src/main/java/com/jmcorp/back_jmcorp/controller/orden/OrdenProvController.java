package com.jmcorp.back_jmcorp.controller.orden;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TOrdenProv;
import com.jmcorp.back_jmcorp.service.OrdenProvService;

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
public class OrdenProvController {
 
    @Autowired
    OrdenProvService ordenprovService;

    @GetMapping("/listarOrdenProv")
    public List<TOrdenProv> listarOrdenProv() {
        return ordenprovService.listarOrdenProv();
    }

    @GetMapping("/listarOrdenProvPorId")
    public ResponseEntity<TOrdenProv> listarId(@RequestParam("id_orden") Long id_orden) {
        // TOrdenProv orden_prov = ordenprovService.listarPorIdcliente(id_orden);

        return ResponseEntity.ok(ordenprovService.listarPorIdOrdenProv(id_orden));

    }

    @PostMapping("/crearOrdenProv")
    @ResponseBody
    public TOrdenProv crearOrdenProv(@RequestBody TOrdenProv orden_prov) {
        return this.ordenprovService.crearOrdenProv(orden_prov);
    }

    @DeleteMapping(value = "/eliminarOrdenProv/{id_orden}")
    public void eliminarOrdenProv(@PathVariable Long id_orden) {
        try {
            ordenprovService.eliminarOrdenProv(id_orden);
        } catch (Exception e) {
            System.out.println("Error al eliminar el orden_prov");
        }
    }

    @PutMapping("/actualizarOrdenProv/{id_orden}")
    public TOrdenProv actualizarOrdenProv(@RequestBody TOrdenProv orden_prov) {
        TOrdenProv actualizarOrdenProv = ordenprovService.actualizarOrdenProv(orden_prov.getId_orden());        
        actualizarOrdenProv.setSecuencia(orden_prov.getSecuencia());//
        actualizarOrdenProv.setFecha_pedido(orden_prov.getFecha_pedido());//
        actualizarOrdenProv.setFecha_entrega(orden_prov.getFecha_entrega());//
        actualizarOrdenProv.setHora(orden_prov.getHora());//
        actualizarOrdenProv.setProducto(orden_prov.getProducto());//
        actualizarOrdenProv.setObservacion(orden_prov.getObservacion());//
        actualizarOrdenProv.setProveedor(orden_prov.getProveedor());
        actualizarOrdenProv.setUsuario(orden_prov.getUsuario());
        actualizarOrdenProv.setEmpresa(orden_prov.getEmpresa());
        ordenprovService.crearOrdenProv(actualizarOrdenProv);
        return actualizarOrdenProv;
    }
}
