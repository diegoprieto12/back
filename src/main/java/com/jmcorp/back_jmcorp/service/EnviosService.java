package com.jmcorp.back_jmcorp.service;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TEnvios;

public interface EnviosService {
    TEnvios crearEnvios(TEnvios envios);
	
	List<TEnvios> listarEnvios();

	void eliminarEnvios(Long id_envios) throws Exception;

	TEnvios actualizarEnvios(Long id_envios);

	TEnvios listarPorIdEnvios(Long id_envios);
}
