package com.jmcorp.back_jmcorp.service;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TCliente;


public interface ClienteService {
    TCliente crearCliente(TCliente cliente);
	
	List<TCliente> listarCliente();

	void eliminarCliente(Long id_cliente) throws Exception;

	TCliente actualizarCliente(Long id_cliente);

	TCliente listarPorIdCliente(Long id_cliente);
}
