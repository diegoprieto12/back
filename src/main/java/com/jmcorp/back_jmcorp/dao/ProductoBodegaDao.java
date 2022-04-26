package com.jmcorp.back_jmcorp.dao;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TProductoBodega;

public interface ProductoBodegaDao {
    TProductoBodega crearProductoBodega(TProductoBodega producto_bodega);
	
	List<TProductoBodega> listarProductoBodega();

	void eliminarProductoBodega(Long id_producto_bodega) throws Exception;

	TProductoBodega actualizarProductoBodega(Long id_producto_bodega);

	TProductoBodega listarPorIdProductoBodega(Long id_producto_bodega);
}
