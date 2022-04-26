package com.jmcorp.back_jmcorp.service;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TOrdenCuerpo;

public interface OrdenCuerpoService {
     
    TOrdenCuerpo crearOrdenCuerpo(TOrdenCuerpo  ordencuerpo);

    List<TOrdenCuerpo> listarOrdenCuerpo();

    void eliminarOrdenCuerpo(Long id_orden_cuerpo) throws Exception;

    TOrdenCuerpo actualizarOrdenCuerpo(Long id_orden_cuerpo);

    TOrdenCuerpo listarPorIdOrdenCuerpo(Long id_orden_cuerpo);
}
