package com.jmcorp.back_jmcorp.controller;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TCliente;
import com.jmcorp.back_jmcorp.service.ClienteService;

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
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping("/listarCliente")
    public List<TCliente> listarcliente() {
        return clienteService.listarCliente();
    }

    @GetMapping("/listarClientePorId")
    public ResponseEntity<TCliente> listarId(@RequestParam("id_cliente") Long id_cliente) {
        // TCliente cliente = clienteService.listarPorIdcliente(id_cliente);

        return ResponseEntity.ok(clienteService.listarPorIdCliente(id_cliente));

    }

    @PostMapping("/crearCliente")
    @ResponseBody
    public TCliente crearcliente(@RequestBody TCliente cliente) {
        return this.clienteService.crearCliente(cliente);
    }

    @DeleteMapping(value = "/eliminarCliente/{id_cliente}")
    public void eliminarcliente(@PathVariable Long id_cliente) {
        try {
            clienteService.eliminarCliente(id_cliente);
        } catch (Exception e) {
            System.out.println("Error al eliminar el cliente");
        }
    }

    @PutMapping("/actualizarCliente/{id_cliente}")
    public TCliente actualizarCliente(@RequestBody TCliente cliente) {
        TCliente actualizarCliente = clienteService.actualizarCliente(cliente.getId_cliente());
        actualizarCliente.setNombre_tipo_cliente(cliente.getNombre_tipo_cliente());
        actualizarCliente.setEstado_cliente(cliente.getEstado_cliente());
        clienteService.crearCliente(actualizarCliente);
        return actualizarCliente;
    }
}