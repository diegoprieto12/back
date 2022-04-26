package com.jmcorp.back_jmcorp.service;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TArticulo;

public interface ArticuloService {
    TArticulo crearArticulo(TArticulo articulo);
	
	List<TArticulo> listarArticulo();

	void eliminarArticulo(Long id_articulo) throws Exception;

	TArticulo actualizarArticulo(Long id_articulo);

	TArticulo listarPorIdArticulo(Long id_articulo);
}
