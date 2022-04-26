package com.jmcorp.back_jmcorp.controller;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TDetallePedido;
import com.jmcorp.back_jmcorp.service.DetallePedidoService;

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
public class DetallePedidoController {

    @Autowired
    DetallePedidoService detallePedidoService;

    @GetMapping("/listarDetallePedido")
    public List<TDetallePedido> listarDetallePedido() {
        return detallePedidoService.listarDetallePedido();
    }

    @GetMapping("/listarDetallePedidoPorId/{id_detalle_pedido}")
    public ResponseEntity<TDetallePedido> listarId(@RequestParam("id_detalle_pedido") Long id_detalle_pedido) {

        return ResponseEntity.ok(detallePedidoService.listarPorIdDetallePedido(id_detalle_pedido));

    }

    @PostMapping("/crearDetallePedido")
    @ResponseBody
    public TDetallePedido crearDetallePedido(@RequestBody TDetallePedido detallePedido) {
        return this.detallePedidoService.crearDetallePedido(detallePedido);
    }

    @DeleteMapping(value = "/eliminarDetallePedido/{id_detalle_pedido}")
    public void eliminarDetallePedido(@PathVariable Long id_detalle_pedido) {
        try {
            detallePedidoService.eliminarDetallePedido(id_detalle_pedido);
        } catch (Exception e) {
            System.out.println("Error al eliminar la detallePedido");
        }
    }

    @PutMapping("/actualizarDetallePedido/{id_detalle_pedido}")
    public TDetallePedido actualizarDetallePedido(@RequestBody TDetallePedido detallePedido) {
        TDetallePedido actualizarDetallePedido = detallePedidoService
                .actualizarDetallePedido(detallePedido.getId_detalle_pedido());
        actualizarDetallePedido.setCantidad_detalle_pedido(detallePedido.getCantidad_detalle_pedido());
        actualizarDetallePedido.setId_articulo_detalle_pedido(detallePedido.getId_articulo_detalle_pedido());
        actualizarDetallePedido.setId_detalle_pedido(detallePedido.getId_detalle_pedido());
        actualizarDetallePedido.setPedido(detallePedido.getPedido());
        detallePedidoService.crearDetallePedido(actualizarDetallePedido);
        return actualizarDetallePedido;
    }
}