package com.jmcorp.back_jmcorp.service;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TTipoUsuario;

public interface TipoUsuarioService {
    TTipoUsuario crearTipoUsuario(TTipoUsuario tipo_usuario);
	
	List<TTipoUsuario> listarTipoUsuario();

	void eliminarTipoUsuario(Long id_tipo_usuario) throws Exception;

	TTipoUsuario actualizarTipoUsuario(Long id_tipo_usuario);

	TTipoUsuario listarPorIdTipoUsuario(Long id_tipo_usuario);
}
