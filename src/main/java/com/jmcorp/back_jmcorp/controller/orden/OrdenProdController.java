package com.jmcorp.back_jmcorp.controller.orden;

import com.jmcorp.back_jmcorp.model.TOrdenProd;
import com.jmcorp.back_jmcorp.service.OrdenProdService;
import java.util.List;

import com.jmcorp.back_jmcorp.model.TOrdenProd;
import com.jmcorp.back_jmcorp.service.OrdenProdService;

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
public class OrdenProdController {
    @Autowired
    OrdenProdService ordenprovService;

    @GetMapping("/listarOrdenProd")
    public List<TOrdenProd> listarOrdenProd() {
        return ordenprovService.listarOrdenProd();
    }

    @GetMapping("/listarOrdenProdPorId")
    public ResponseEntity<TOrdenProd> listarId(@RequestParam("id_orden_prod") Long id_orden_prod) {
        // TOrdenProd orden_prov = ordenprovService.listarPorIdcliente(id_orden_prod);

        return ResponseEntity.ok(ordenprovService.listarPorIdOrdenProd(id_orden_prod));

    }

    @PostMapping("/crearOrdenProd")
    @ResponseBody
    public TOrdenProd crearOrdenProd(@RequestBody TOrdenProd orden_prov) {
        return this.ordenprovService.crearOrdenProd(orden_prov);
    }

    @DeleteMapping(value = "/eliminarOrdenProd/{id_orden_prod}")
    public void eliminarOrdenProd(@PathVariable Long id_orden_prod) {
        try {
            ordenprovService.eliminarOrdenProd(id_orden_prod);
        } catch (Exception e) {
            System.out.println("Error al eliminar el orden_prov");
        }
    }

    @PutMapping("/actualizarOrdenProd/{id_orden_prod}")
    public TOrdenProd actualizarOrdenProd(@RequestBody TOrdenProd orden_prov) {
        TOrdenProd actualizarOrdenProd = ordenprovService.actualizarOrdenProd(orden_prov.getId_orden_prod());        
        actualizarOrdenProd.setSecuencia(orden_prov.getSecuencia());//
        actualizarOrdenProd.setFecha_pedido(orden_prov.getFecha_pedido());//
        actualizarOrdenProd.setFecha_entrega(orden_prov.getFecha_entrega());//
        actualizarOrdenProd.setHora(orden_prov.getHora());//
        actualizarOrdenProd.setProducto(orden_prov.getProducto());//
        actualizarOrdenProd.setObservacion(orden_prov.getObservacion());//
        actualizarOrdenProd.setUsuario(orden_prov.getUsuario());
        actualizarOrdenProd.setEmpresa(orden_prov.getEmpresa());
        actualizarOrdenProd.setAutorizacion(orden_prov.getAutorizacion());
        ordenprovService.crearOrdenProd(actualizarOrdenProd);
        return actualizarOrdenProd;
    }
}

