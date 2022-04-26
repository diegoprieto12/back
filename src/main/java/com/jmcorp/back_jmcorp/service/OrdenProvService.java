package com.jmcorp.back_jmcorp.service;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TOrdenProv;

public interface OrdenProvService {

    TOrdenProv crearOrdenProv(TOrdenProv orden_prov);
	
	List<TOrdenProv> listarOrdenProv();

	void eliminarOrdenProv(Long id_orden_prov) throws Exception;

	TOrdenProv actualizarOrdenProv(Long id_orden_prov);

	TOrdenProv listarPorIdOrdenProv(Long id_orden_prov); 
}
