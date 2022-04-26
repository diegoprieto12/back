package com.jmcorp.back_jmcorp.dao;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TCliente;

public interface ClienteDao {
    TCliente crearCliente(TCliente cliente);
	
	List<TCliente> listarCliente();

	void eliminarCliente(Long id_cliente) throws Exception;

	TCliente actualizarCliente(Long id_cliente);

	TCliente listarPorIdCliente(Long id_cliente);
}
