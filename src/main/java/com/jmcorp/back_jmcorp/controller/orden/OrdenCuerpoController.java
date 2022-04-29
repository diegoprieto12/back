package com.jmcorp.back_jmcorp.controller.orden;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TArticulo;
import com.jmcorp.back_jmcorp.model.TBodega;
import com.jmcorp.back_jmcorp.model.TOrdenCuerpo;
import com.jmcorp.back_jmcorp.model.TProveedor;
import com.jmcorp.back_jmcorp.service.ArticuloService;
import com.jmcorp.back_jmcorp.service.BodegaService;
import com.jmcorp.back_jmcorp.service.OrdenCuerpoService;
import com.jmcorp.back_jmcorp.service.ProveedorService;

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
import org.springframework.http.HttpStatus;

@RestController
public class OrdenCuerpoController {

    @Autowired
    OrdenCuerpoService ordenCuerpoService;

    @GetMapping("/listarOrdenCuerpo")
    public List<TOrdenCuerpo> listarOrdenCuerpo() {
        return ordenCuerpoService.listarOrdenCuerpo();
    }

    @GetMapping("/ListarOrdenCuerpoPorId")
    public ResponseEntity<TOrdenCuerpo> listarId(@RequestParam("id_orden_cuerpo") Long id_orden_cuerpo) {
        return ResponseEntity.ok(ordenCuerpoService.listarPorIdOrdenCuerpo(id_orden_cuerpo));
    }

    @PostMapping("/crearOrdenCuerpo")
    @ResponseBody
    public TOrdenCuerpo crearOrdenCuerpo(@RequestBody TOrdenCuerpo ordenCuerpo) {
        return this.ordenCuerpoService.crearOrdenCuerpo(ordenCuerpo);
    }

    @DeleteMapping(value = "/eliminarOrdenCuerpo/{id_orden_cuerpo}")
    public void eliminarOrdenCuerpo(@PathVariable Long id_orden_cuerpo) {
        try {
            ordenCuerpoService.eliminarOrdenCuerpo(id_orden_cuerpo);
        } catch (Exception e) {
            // System.out.println("Error al eliminar la ");
        }
    }

    @PutMapping("/actualizarOrdenCuerpo/{id_orden_cuerpo}")
    public TOrdenCuerpo actualizarOrden(@RequestBody TOrdenCuerpo ordenCuerpo) {
        TOrdenCuerpo actualizarOrdenCuerpo = ordenCuerpoService.actualizarOrdenCuerpo(ordenCuerpo.getId_orden_cuerpo());
        // actualizarOrdenCuerpo.setCantidad(ordenCuerpo.getCantidad());//
        actualizarOrdenCuerpo.setAnticipo(ordenCuerpo.getAnticipo());//
        actualizarOrdenCuerpo.setBanco(ordenCuerpo.getBanco());
        actualizarOrdenCuerpo.setCosto_transporte(ordenCuerpo.getCosto_transporte());//
        actualizarOrdenCuerpo.setDescripcion(ordenCuerpo.getDescripcion());//
        actualizarOrdenCuerpo.setForma_de_pago(ordenCuerpo.getForma_de_pago());//
        actualizarOrdenCuerpo.setHora(ordenCuerpo.getHora());
        actualizarOrdenCuerpo.setIva(ordenCuerpo.getIva());//
        actualizarOrdenCuerpo.setIva_12(ordenCuerpo.getIva_12());//
        actualizarOrdenCuerpo.setProducto(ordenCuerpo.getProducto());//
        actualizarOrdenCuerpo.setSaldo(ordenCuerpo.getSaldo());//
        actualizarOrdenCuerpo.setSubtotal(ordenCuerpo.getSubtotal());//
        actualizarOrdenCuerpo.setSubtotal_12(ordenCuerpo.getSubtotal_12());//
        actualizarOrdenCuerpo.setSubtotal_iva(ordenCuerpo.getSubtotal_iva());//
        actualizarOrdenCuerpo.setTransporte(ordenCuerpo.getTransporte());//
        actualizarOrdenCuerpo.setValor_total(ordenCuerpo.getValor_total());//
        actualizarOrdenCuerpo.setTipo_transporte(ordenCuerpo.getTipo_transporte());//
        actualizarOrdenCuerpo.setNum_cheque(ordenCuerpo.getNum_cheque());//
        actualizarOrdenCuerpo.setLocal_retiro(ordenCuerpo.getLocal_retiro());//
        actualizarOrdenCuerpo.setImagen_destinatario(ordenCuerpo.getImagen_destinatario());//
        ordenCuerpoService.crearOrdenCuerpo(actualizarOrdenCuerpo);
        return actualizarOrdenCuerpo;
    }

}
