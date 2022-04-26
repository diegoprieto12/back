package com.jmcorp.back_jmcorp.service;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TPedido;

public interface PedidoService {
    TPedido crearPedido(TPedido pedido);
	
	List<TPedido> listarPedido();

	void eliminarPedido(Long id_pedido) throws Exception;

	TPedido actualizarPedido(Long id_pedido);

	TPedido listarPorIdPedido(Long id_pedido);
}
