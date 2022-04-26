package com.jmcorp.back_jmcorp.dao.implemantacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.OrdenCuerpoDao;
import com.jmcorp.back_jmcorp.model.TOrdenCuerpo;
import com.jmcorp.back_jmcorp.repository.OrdenCuerpoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrdenCuerpoDaoImpl implements OrdenCuerpoDao{
    
    @Autowired
    OrdenCuerpoRepository ordenCuerpoRepository;

    @Override
    public TOrdenCuerpo crearOrdenCuerpo(TOrdenCuerpo ordencuerpo) {
        TOrdenCuerpo crearOrdenCuerpo = ordenCuerpoRepository.save(ordencuerpo);
        return crearOrdenCuerpo;
    }

    @Override
    public List<TOrdenCuerpo> listarOrdenCuerpo() {
        List<TOrdenCuerpo> listarOrdenCuerpo= ordenCuerpoRepository.findAll();
        return listarOrdenCuerpo;
    }

    @Override
    public void eliminarOrdenCuerpo(Long id_orden_cuerpo) throws Exception {
        ordenCuerpoRepository.deleteById(id_orden_cuerpo);
        
    }

    @Override
    public TOrdenCuerpo actualizarOrdenCuerpo(Long id_orden_cuerpo) {
        TOrdenCuerpo actualizarOrdenCuerpo= ordenCuerpoRepository.getById(id_orden_cuerpo);
        return actualizarOrdenCuerpo;
    }

    @Override
    public TOrdenCuerpo listarPorIdOrdenCuerpo(Long id_orden_cuerpo) {
        TOrdenCuerpo listarPorIdOrdenCuerpo= ordenCuerpoRepository.getById(id_orden_cuerpo);
        return listarPorIdOrdenCuerpo;
    }

    
}
