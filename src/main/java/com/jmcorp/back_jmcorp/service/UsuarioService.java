package com.jmcorp.back_jmcorp.service;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TUsuario;

public interface UsuarioService {
	TUsuario crearUsuario(TUsuario usuario);

	List<TUsuario> listarUsuario();

	void eliminarUsuario(Long id_usuario) throws Exception;

	TUsuario actualizarUsuario(Long id_usuario);

	TUsuario listarPorIdUsuario(Long id_usuario);

	// TUsuario iniciarSesion(String nombre_usuario, String pass_usuario);
}
