package com.jmcorp.back_jmcorp.service;

import java.util.List;

import com.jmcorp.back_jmcorp.controller.Timagen;

public interface ImagenService {
    
    Timagen crearImagen(Timagen imagen);
	
	List<Timagen> listarImagen();

	void eliminarImagen(Long id_imagen) throws Exception;

	Timagen actualizarImagen(Long id_imagen);

	Timagen listarPorIdImagen(Long id_imagen);
}
