package com.jmcorp.back_jmcorp.dao;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TPersona;

public interface PersonaDao {
    TPersona crearPersona(TPersona persona);
	
	List<TPersona> listarPersona();

	void eliminarPersona(Long id_persona) throws Exception;

	TPersona actualizarPersona(Long id_persona);

	TPersona listarPorIdPersona(Long id_persona);
	
}
