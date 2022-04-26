package com.jmcorp.back_jmcorp.dao;

import java.util.List;

import com.jmcorp.back_jmcorp.controller.Timagen;

public interface ImagenDao {
    Timagen crearImagen(Timagen Imagen);
	
	List<Timagen> listarImagen();

	void eliminarImagen(Long id_imagen) throws Exception;

	Timagen actualizarImagen(Long id_imagen);

	Timagen listarPorIdImagen(Long id_imagen);
}
