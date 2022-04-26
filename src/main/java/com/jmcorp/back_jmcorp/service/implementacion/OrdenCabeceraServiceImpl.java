package com.jmcorp.back_jmcorp.service.implementacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.OrdenCabeceraDao;
import com.jmcorp.back_jmcorp.model.TOrdenCabecera;
import com.jmcorp.back_jmcorp.service.OrdenCabeceraService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenCabeceraServiceImpl implements OrdenCabeceraService{
    
    @Autowired
    OrdenCabeceraDao ordencabDao;

    @Override
    public TOrdenCabecera crearOrdenCabecera(TOrdenCabecera ordencabecera) {
        TOrdenCabecera crearOrdenCabecera = ordencabDao.crearOrdenCabecera(ordencabecera);
        return crearOrdenCabecera;
    }

    @Override
    public List<TOrdenCabecera> listarOrdenCabecera() {
        List<TOrdenCabecera> listarOrdenCabecera = ordencabDao.listarOrdenCabecera();
        return listarOrdenCabecera;
    }

    @Override
    public void eliminarOrdenCabecera(Long id_orden_cabecera) throws Exception {
        ordencabDao.eliminarOrdenCabecera(id_orden_cabecera);
        
    }

    @Override
    public TOrdenCabecera actualizarOrdenCabecera(Long id_orden_cabecera) {
        TOrdenCabecera actualizarOrdenCabecera = ordencabDao.actualizarOrdenCabecera(id_orden_cabecera);
        return actualizarOrdenCabecera;
    }

    @Override
    public TOrdenCabecera listarPorIdOrdenCabecera(Long id_orden_cabecera) {
        TOrdenCabecera listarPorIdOrdenCabecera = ordencabDao.listarPorIdOrdenCabecera(id_orden_cabecera);
        return listarPorIdOrdenCabecera;
    }


}
