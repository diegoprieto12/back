package com.jmcorp.back_jmcorp.dao;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TProducto;

public interface ProductoDao {
    TProducto crearProducto(TProducto producto);
	
	List<TProducto> listarProducto();

	void eliminarProducto(Long id_producto) throws Exception;

	TProducto actualizarProducto(Long id_producto);

	TProducto listarPorIdProducto(Long id_producto);
}
