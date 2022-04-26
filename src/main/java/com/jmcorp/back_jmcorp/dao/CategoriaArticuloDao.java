package com.jmcorp.back_jmcorp.dao;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TCategoriaArticulo;

public interface CategoriaArticuloDao {
    TCategoriaArticulo crearCategoriaArticulo(TCategoriaArticulo categoria_articulo);
	
	List<TCategoriaArticulo> listarCategoriaArticulo();

	void eliminarCategoriaArticulo(Long id_cat_articulo) throws Exception;

	TCategoriaArticulo actualizarCategoriaArticulo(Long id_cat_articulo);

	TCategoriaArticulo listarPorIdCategoriaArticulo(Long id_cat_articulo);
}
