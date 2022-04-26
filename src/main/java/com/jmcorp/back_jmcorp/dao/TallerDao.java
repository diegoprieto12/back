package com.jmcorp.back_jmcorp.dao;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TTaller;

public interface TallerDao {
    TTaller crearTaller(TTaller taller);
	
	List<TTaller> listarTaller();

	void eliminarTaller(Long id_taller) throws Exception;

	TTaller actualizarTaller(Long id_taller);

	TTaller listarPorIdTaller(Long id_taller);
}
