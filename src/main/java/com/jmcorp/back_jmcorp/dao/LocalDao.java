package com.jmcorp.back_jmcorp.dao;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TLocal;

public interface LocalDao {
    TLocal crearLocal(TLocal local);
	
	List<TLocal> listarLocal();

	void eliminarLocal(Long id_local) throws Exception;

	TLocal actualizarLocal(Long id_local);

	TLocal listarPorIdLocal(Long id_local);
}
