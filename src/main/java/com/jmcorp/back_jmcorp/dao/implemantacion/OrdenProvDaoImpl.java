package com.jmcorp.back_jmcorp.dao.implemantacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.OrdenProvDao;
import com.jmcorp.back_jmcorp.model.TOrdenProv;
import com.jmcorp.back_jmcorp.repository.OrdenProvRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrdenProvDaoImpl implements OrdenProvDao{
    
    @Autowired
    OrdenProvRepository ordenprovRepository;

    @Override
    public TOrdenProv crearOrdenProv(TOrdenProv orden_prov) {
        TOrdenProv crearOrdenProv = ordenprovRepository.save(orden_prov);
        return crearOrdenProv;
    }

    @Override
    public List<TOrdenProv> listarOrdenProv() {
        List<TOrdenProv> listarOrdenProv = ordenprovRepository.findAll();
        return listarOrdenProv;
    }

    @Override
    public void eliminarOrdenProv(Long id_orden_prov) throws Exception {
        ordenprovRepository.deleteById(id_orden_prov);

    }

    @Override
    public TOrdenProv actualizarOrdenProv(Long id_orden_prov) {
        TOrdenProv actualizarOrdenProv = ordenprovRepository.getById(id_orden_prov);
        return actualizarOrdenProv;
    }

    @Override
    public TOrdenProv listarPorIdOrdenProv(Long id_orden_prov) {
        TOrdenProv listarPorId = ordenprovRepository.getById(id_orden_prov);
        return listarPorId;
    }

}