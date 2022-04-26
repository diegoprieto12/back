package com.jmcorp.back_jmcorp.service;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TCajaChica;

public interface CajachicaService {
    TCajaChica crearCajaChica(TCajaChica cajaChica);
	
	List<TCajaChica> listarCajaChica();

	void eliminarCajaChica(Long id_cajaChica) throws Exception;

	TCajaChica actualizarCajaChica(Long id_cajaChica);

	TCajaChica listarPorIdCajaChica(Long id_cajaChica);
}
