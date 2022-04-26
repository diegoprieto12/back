package com.jmcorp.back_jmcorp.dao;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TTipoUsuario;

public interface TipoUsuarioDao {
    TTipoUsuario crearTipoUsuario(TTipoUsuario tipo_usuario);
	
	List<TTipoUsuario> listarTipoUsuario();

	void eliminarTipoUsuario(Long id_tipo_usuario) throws Exception;

	TTipoUsuario actualizarTipoUsuario(Long id_tipo_usuario);

	TTipoUsuario listarPorIdTipoUsuario(Long id_tipo_usuario);
}
