package com.jmcorp.back_jmcorp.service.implementacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.OrdenProdDao;
import com.jmcorp.back_jmcorp.model.TOrdenProd;
import com.jmcorp.back_jmcorp.service.OrdenProdService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenProdServiceImpl implements OrdenProdService{
    @Autowired
    OrdenProdDao ordenprodDao;

    @Override
    public TOrdenProd crearOrdenProd(TOrdenProd orden_prod) {

        TOrdenProd crearOrdenProd = ordenprodDao.crearOrdenProd(orden_prod);
        return crearOrdenProd;
    }

    @Override
    public List<TOrdenProd> listarOrdenProd() {
        List<TOrdenProd> listarOrdenProd = ordenprodDao.listarOrdenProd();
        return listarOrdenProd;
    }

    @Override
    public void eliminarOrdenProd(Long id_orden_prod) throws Exception {
        ordenprodDao.eliminarOrdenProd(id_orden_prod);

    }

    @Override
    public TOrdenProd actualizarOrdenProd(Long id_orden_prod) {
        TOrdenProd actualizarOrdenProd = ordenprodDao.actualizarOrdenProd(id_orden_prod);
        return actualizarOrdenProd;
    }

    @Override
    public TOrdenProd listarPorIdOrdenProd(Long id_orden_prod) {
        TOrdenProd listarPorId = ordenprodDao.actualizarOrdenProd(id_orden_prod);
        return listarPorId;
    }

}
