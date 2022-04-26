package com.jmcorp.back_jmcorp.dao;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TCategoriaProducto;

public interface CategoriaProductoDao {
    TCategoriaProducto crearCategoriaProducto(TCategoriaProducto categoria_producto);
	
	List<TCategoriaProducto> listarCategoriaProducto();

	void eliminarCategoriaProducto(Long id_cat_producto) throws Exception;

	TCategoriaProducto actualizarCategoriaProducto(Long id_cat_producto);

	TCategoriaProducto listarPorIdCategoriaProducto(Long id_cat_producto);
}
