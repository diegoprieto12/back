package com.jmcorp.back_jmcorp.service.implementacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.OrdenCuerpoDao;
import com.jmcorp.back_jmcorp.model.TOrdenCuerpo;
import com.jmcorp.back_jmcorp.service.OrdenCuerpoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenCuerpoServiceImpl implements OrdenCuerpoService{
    
    @Autowired
    OrdenCuerpoDao ordenCuerpoDao;

    @Override
    public TOrdenCuerpo crearOrdenCuerpo(TOrdenCuerpo ordencuerpo) {
        TOrdenCuerpo crearOrdenCuerpo = ordenCuerpoDao.crearOrdenCuerpo(ordencuerpo);
        return crearOrdenCuerpo;
    }

    @Override
    public List<TOrdenCuerpo> listarOrdenCuerpo() {        
        List<TOrdenCuerpo> listarOrdenCuerpo= ordenCuerpoDao.listarOrdenCuerpo();
        return listarOrdenCuerpo;
    }

    @Override
    public void eliminarOrdenCuerpo(Long id_orden_cuerpo) throws Exception {
        ordenCuerpoDao.eliminarOrdenCuerpo(id_orden_cuerpo);
        
    }

    @Override
    public TOrdenCuerpo actualizarOrdenCuerpo(Long id_orden_cuerpo) {
        TOrdenCuerpo actualizarOrdenCuerpo= ordenCuerpoDao.actualizarOrdenCuerpo(id_orden_cuerpo);
        return actualizarOrdenCuerpo;
    }

    @Override
    public TOrdenCuerpo listarPorIdOrdenCuerpo(Long id_orden_cuerpo) {
        TOrdenCuerpo listarPorIdOrdenCuerpo= ordenCuerpoDao.listarPorIdOrdenCuerpo(id_orden_cuerpo);
        return listarPorIdOrdenCuerpo;
    }


}
