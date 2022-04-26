package com.jmcorp.back_jmcorp.dao;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TCatalogoProducto;

public interface CatalogoProductoDao {
    TCatalogoProducto crearCatalogoProducto(TCatalogoProducto catalogo_producto);
	
	List<TCatalogoProducto> listarCatalogoProducto();

	void eliminarCatalogoProducto(Long id_catalogo) throws Exception;

	TCatalogoProducto actualizarCatalogoProducto(Long id_catalogo);

	TCatalogoProducto listarPorIdCatalogoProducto(Long id_catalogo);
}
