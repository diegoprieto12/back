package com.jmcorp.back_jmcorp.dao;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TUsuario;

public interface UsuarioDao {
	TUsuario crearUsuario(TUsuario usuario);

	List<TUsuario> listarUsuario();

	void eliminarUsuario(Long id_usuario) throws Exception;

	TUsuario actualizarUsuario(Long id_usuario);

	TUsuario listarPorIdUsuario(Long id_usuario);

}
