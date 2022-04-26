package com.jmcorp.back_jmcorp.dao.implemantacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.BodegaDao;
import com.jmcorp.back_jmcorp.model.TBodega;
import com.jmcorp.back_jmcorp.repository.BodegaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BodegaDaoImpl implements BodegaDao {
    @Autowired
    BodegaRepository bodegaRepository;

    @Override
    public TBodega crearBodega(TBodega bodega) {
        TBodega crearBodega = bodegaRepository.save(bodega);
        return crearBodega;
    }

    @Override
    public List<TBodega> listarBodega() {
        List<TBodega> listarBodega = bodegaRepository.findAll();
        return listarBodega;
    }

    @Override
    public void eliminarBodega(Long id_bodega) throws Exception {
        bodegaRepository.deleteById(id_bodega);
    }

    @Override
    public TBodega actualizarBodega(Long id_bodega) {
        TBodega actualizarBodega = bodegaRepository.getById(id_bodega);
        return actualizarBodega;
    }

    @Override
    public TBodega listarPorIdBodega(Long id_bodega) {
        TBodega listarPorId = bodegaRepository.getById(id_bodega);
        return listarPorId;
    }

}