package com.jmcorp.back_jmcorp.dao.implemantacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.OrdenCabeceraDao;
import com.jmcorp.back_jmcorp.model.TOrdenCabecera;
import com.jmcorp.back_jmcorp.repository.OrdenCabeceraRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrdenCabeceraDaoImpl implements OrdenCabeceraDao{
    
    @Autowired
    OrdenCabeceraRepository ordenCabeceraRepository;

    @Override
    public TOrdenCabecera crearOrdenCabecera(TOrdenCabecera ordencabecera) {
        TOrdenCabecera crearOrdenCabecera = ordenCabeceraRepository.save(ordencabecera);
        return crearOrdenCabecera;
    }

    @Override
    public List<TOrdenCabecera> listarOrdenCabecera() {
        List<TOrdenCabecera> listarOrdenCabecera = ordenCabeceraRepository.findAll();
        return listarOrdenCabecera;
    }

    @Override
    public void eliminarOrdenCabecera(Long id_orden_cabecera) throws Exception {
        ordenCabeceraRepository.deleteById(id_orden_cabecera);
        
    }

    @Override
    public TOrdenCabecera actualizarOrdenCabecera(Long id_orden_cabecera) {
        TOrdenCabecera actualizarOrdenCabecera = ordenCabeceraRepository.getById(id_orden_cabecera);
        return actualizarOrdenCabecera;
    }

    @Override
    public TOrdenCabecera listarPorIdOrdenCabecera(Long id_orden_cabecera) {
        TOrdenCabecera listarPorIdOrdenCabecera = ordenCabeceraRepository.getById(id_orden_cabecera);
        return listarPorIdOrdenCabecera;
    }


}
