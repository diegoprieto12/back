package com.jmcorp.back_jmcorp.service;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TOrdenCabecera;

public interface OrdenCabeceraService {
	
    TOrdenCabecera crearOrdenCabecera(TOrdenCabecera ordencabecera);
	
	List<TOrdenCabecera> listarOrdenCabecera();

	void eliminarOrdenCabecera(Long id_orden_cabecera) throws Exception;

	TOrdenCabecera actualizarOrdenCabecera(Long id_orden_cabecera);

	TOrdenCabecera listarPorIdOrdenCabecera(Long id_orden_cabecera);
}
