package com.jmcorp.back_jmcorp.controller;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TPedido;
import com.jmcorp.back_jmcorp.service.PedidoService;

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
public class PedidoController {

    @Autowired
    PedidoService pedidoService;

    @GetMapping("/listarPedido")
    public List<TPedido> listarPedido() {
        return pedidoService.listarPedido();
    }

    @GetMapping("/listarPedidoPorId/{id_pedido}")
    public ResponseEntity<TPedido> listarId(@RequestParam("id_pedido") Long id_pedido) {

        return ResponseEntity.ok(pedidoService.listarPorIdPedido(id_pedido));

    }

    @PostMapping("/crearPedido")
    @ResponseBody
    public TPedido crearPedido(@RequestBody TPedido persona) {
        return this.pedidoService.crearPedido(persona);
    }

    @DeleteMapping(value = "/eliminarPedido/{id_pedido}")
    public void eliminarPedido(@PathVariable Long id_pedido) {
        try {
            pedidoService.eliminarPedido(id_pedido);
        } catch (Exception e) {
            System.out.println("Error al eliminar la persona");
        }
    }

    @PutMapping("/actualizarPedido/{id_pedido}")
    public TPedido actualizarPedido(@RequestBody TPedido persona) {
        TPedido actualizarPedido = pedidoService.actualizarPedido(persona.getId_pedido());
        actualizarPedido.setEstado_pedido(persona.getEstado_pedido());
        actualizarPedido.setNotas_pedido(persona.getNotas_pedido());
        actualizarPedido.setDomicilio_pedido(persona.getDomicilio_pedido());
        actualizarPedido.setAbono_pedido(persona.getAbono_pedido());
        actualizarPedido.setTipo_factura_pedido(persona.getTipo_factura_pedido());
        pedidoService.crearPedido(actualizarPedido);
        return actualizarPedido;
    }
}