package com.jmcorp.back_jmcorp.dao;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TOrdenProd;

public interface OrdenProdDao {
    TOrdenProd crearOrdenProd(TOrdenProd ordenProd);
	
	List<TOrdenProd> listarOrdenProd();

	void eliminarOrdenProd(Long id_orden_prod) throws Exception;

	TOrdenProd actualizarOrdenProd(Long id_orden_prod);

	TOrdenProd listarPorIdOrdenProd(Long id_orden_prod);
}
