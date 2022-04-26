package com.jmcorp.back_jmcorp.dao;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TProductoComprometido;

public interface ProductoComprometidoDao {
    TProductoComprometido crearProductoComprometido(TProductoComprometido producto_comprometido);
	
	List<TProductoComprometido> listarProductoComprometido();

	void eliminarProductoComprometido(Long id_producto_comprometido) throws Exception;

	TProductoComprometido actualizarProductoComprometido(Long id_producto_comprometido);

	TProductoComprometido listarPorIdProductoComprometido(Long id_producto_comprometido);
}
