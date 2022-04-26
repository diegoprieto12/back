package com.jmcorp.back_jmcorp.service.implementacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.OrdenProvDao;
import com.jmcorp.back_jmcorp.model.TOrdenProv;
import com.jmcorp.back_jmcorp.service.OrdenProvService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenProvServiceImpl implements OrdenProvService{
    
    @Autowired
    OrdenProvDao ordenprovDao;

    @Override
    public TOrdenProv crearOrdenProv(TOrdenProv orden_prov) {

        TOrdenProv crearOrdenProv = ordenprovDao.crearOrdenProv(orden_prov);
        return crearOrdenProv;
    }

    @Override
    public List<TOrdenProv> listarOrdenProv() {
        List<TOrdenProv> listarOrdenProv = ordenprovDao.listarOrdenProv();
        return listarOrdenProv;
    }

    @Override
    public void eliminarOrdenProv(Long id_orden_prov) throws Exception {
        ordenprovDao.eliminarOrdenProv(id_orden_prov);

    }

    @Override
    public TOrdenProv actualizarOrdenProv(Long id_orden_prov) {
        TOrdenProv actualizarOrdenProv = ordenprovDao.actualizarOrdenProv(id_orden_prov);
        return actualizarOrdenProv;
    }

    @Override
    public TOrdenProv listarPorIdOrdenProv(Long id_orden_prov) {
        TOrdenProv listarPorId = ordenprovDao.actualizarOrdenProv(id_orden_prov);
        return listarPorId;
    }

}
