package com.jmcorp.back_jmcorp.service;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TProductoComprometido;

public interface ProductoComprometidoService {
    TProductoComprometido crearProductoComprometido(TProductoComprometido producto_comprometido);
	
	List<TProductoComprometido> listarProductoComprometido();

	void eliminarProductoComprometido(Long id_producto_comprometido) throws Exception;

	TProductoComprometido actualizarProductoComprometido(Long id_producto_comprometido);

	TProductoComprometido listarPorIdProductoComprometido(Long id_producto_comprometido);
}
