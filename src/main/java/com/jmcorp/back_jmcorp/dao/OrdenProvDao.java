package com.jmcorp.back_jmcorp.dao;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TOrdenProv;

public interface OrdenProvDao {
    TOrdenProv crearOrdenProv(TOrdenProv ordenProv);
	
	List<TOrdenProv> listarOrdenProv();

	void eliminarOrdenProv(Long id_orden) throws Exception;

	TOrdenProv actualizarOrdenProv(Long id_orden);

	TOrdenProv listarPorIdOrdenProv(Long id_orden);
    
}
