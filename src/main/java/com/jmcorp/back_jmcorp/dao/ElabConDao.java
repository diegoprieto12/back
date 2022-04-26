package com.jmcorp.back_jmcorp.dao;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TElabCon;


public interface ElabConDao {
    
    TElabCon crearElabcon(TElabCon elabcon);
	
	List<TElabCon> listarElabCon();

	void eliminarElabCon(Long id_elab_con) throws Exception;

	TElabCon actualizarElabCon(Long id_elab_con);

	TElabCon listarPorIdElabCon(Long id_elab_con);
}
