package com.jmcorp.back_jmcorp.service;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TMedida;


public interface MedidaService {
    TMedida crearMedida(TMedida medida);
	
	List<TMedida> listarMedida();

	void eliminarMedida(Long id_medida) throws Exception;

	TMedida actualizarMedida(Long id_medida);

	TMedida listarPorIdMedida(Long id_medida);
}
