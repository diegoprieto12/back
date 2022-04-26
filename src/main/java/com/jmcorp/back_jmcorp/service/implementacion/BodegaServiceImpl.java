package com.jmcorp.back_jmcorp.service.implementacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.BodegaDao;
import com.jmcorp.back_jmcorp.model.TBodega;
import com.jmcorp.back_jmcorp.service.BodegaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BodegaServiceImpl implements BodegaService {
    @Autowired
    BodegaDao bodegaDao;

    @Override
    public TBodega crearBodega(TBodega bodega) {
        TBodega crearBodega = bodegaDao.crearBodega(bodega);
        return crearBodega;
    }

    @Override
    public List<TBodega> listarBodega() {
        List<TBodega> listarBodega = bodegaDao.listarBodega();
        return listarBodega;
    }

    @Override
    public void eliminarBodega(Long id_bodega) throws Exception {
        bodegaDao.eliminarBodega(id_bodega);
    }

    @Override
    public TBodega actualizarBodega(Long id_bodega) {
        TBodega actualizarBodega = bodegaDao.actualizarBodega(id_bodega);
        return actualizarBodega;
    }

    @Override
    public TBodega listarPorIdBodega(Long id_bodega) {
        TBodega listarPorId = bodegaDao.listarPorIdBodega(id_bodega);
        return listarPorId;
    }

}