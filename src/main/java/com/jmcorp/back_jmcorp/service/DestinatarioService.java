package com.jmcorp.back_jmcorp.service;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TDestinatario;

public interface DestinatarioService {
    TDestinatario crearDestinatario(TDestinatario destinatario);
	
	List<TDestinatario> listarDestinatario();

	void eliminarDestinatario(Long id_destinatario) throws Exception;

	TDestinatario actualizarDestinatario(Long id_destinatario);

	TDestinatario listarPorIdDestinatario(Long id_destinatario);
}
