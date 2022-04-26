package com.jmcorp.back_jmcorp.dao;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TCajaChica;

public interface CajachicaDao {
    TCajaChica crearCajaChica(TCajaChica cajaChica);
	
	List<TCajaChica> listarCajaChica();

	void eliminarCajaChica(Long id_cajaChica) throws Exception;

	TCajaChica actualizarCajaChica(Long id_cajaChica);

	TCajaChica listarPorIdCajaChica(Long id_cajaChica);
}