package com.jmcorp.back_jmcorp.service;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TCategoriaProducto;

public interface CategoriaProductoService {
    TCategoriaProducto crearCategoriaProducto(TCategoriaProducto categoria_producto);
	
	List<TCategoriaProducto> listarCategoriaProducto();

	void eliminarCategoriaProducto(Long id_cat_producto) throws Exception;

	TCategoriaProducto actualizarCategoriaProducto(Long id_cat_producto);

	TCategoriaProducto listarPorIdCategoriaProducto(Long id_cat_producto);
}
