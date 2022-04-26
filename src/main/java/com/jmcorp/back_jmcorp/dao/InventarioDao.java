package com.jmcorp.back_jmcorp.dao;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TInventario;

public interface  InventarioDao {
    TInventario crearInventario(TInventario inventario);
	
	List<TInventario> listarInventario();

	void eliminarInventario(Long id_inventario) throws Exception;

	TInventario actualizarInventario(Long id_inventario);

	TInventario listarPorIdInventario(Long id_inventario);
}
