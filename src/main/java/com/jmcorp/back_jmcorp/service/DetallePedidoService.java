package com.jmcorp.back_jmcorp.service;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TDetallePedido;

public interface DetallePedidoService {
    TDetallePedido crearDetallePedido(TDetallePedido detalle_pedido);
	
	List<TDetallePedido> listarDetallePedido();

	void eliminarDetallePedido(Long id_detalle_pedido) throws Exception;

	TDetallePedido actualizarDetallePedido(Long id_detalle_pedido);

	TDetallePedido listarPorIdDetallePedido(Long id_detalle_pedido);
}
