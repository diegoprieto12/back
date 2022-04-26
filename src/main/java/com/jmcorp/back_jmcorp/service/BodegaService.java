package com.jmcorp.back_jmcorp.service;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TBodega;

public interface BodegaService {
    TBodega crearBodega(TBodega bodega);
	
	List<TBodega> listarBodega();

	void eliminarBodega(Long id_bodega) throws Exception;

	TBodega actualizarBodega(Long id_bodega);

	TBodega listarPorIdBodega(Long id_bodega);
}
