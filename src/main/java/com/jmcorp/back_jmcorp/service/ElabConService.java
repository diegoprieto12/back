package com.jmcorp.back_jmcorp.service;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TElabCon;


public interface ElabConService {

    TElabCon crearTElabCon(TElabCon TElabCon);
	
	List<TElabCon> listarTElabCon();

	void eliminarTElabCon(Long id_TElabCon) throws Exception;

	TElabCon actualizarTElabCon(Long id_TElabCon);

	TElabCon listarPorIdTElabCon(Long id_TElabCon);
	
}
