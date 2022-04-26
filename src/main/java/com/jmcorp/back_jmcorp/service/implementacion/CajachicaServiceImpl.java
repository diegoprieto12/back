package com.jmcorp.back_jmcorp.service.implementacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.CajachicaDao;
import com.jmcorp.back_jmcorp.model.TCajaChica;
import com.jmcorp.back_jmcorp.service.CajachicaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CajachicaServiceImpl implements CajachicaService{
    @Autowired
    CajachicaDao cajaChicaDao;

    @Override
    public TCajaChica crearCajaChica(TCajaChica cajaChica) {
        TCajaChica listarCajaChica = cajaChicaDao.crearCajaChica(cajaChica);
        return listarCajaChica;
    }

    @Override
    public List<TCajaChica> listarCajaChica() {
        List<TCajaChica> listarCajaChica = cajaChicaDao.listarCajaChica();
        return listarCajaChica;
    }

    @Override
    public void eliminarCajaChica(Long id_cajaChica) throws Exception {
        cajaChicaDao.eliminarCajaChica(id_cajaChica);

    }

    @Override
    public TCajaChica actualizarCajaChica(Long id_cajaChica) {
        TCajaChica actualizarCajaChica = cajaChicaDao.actualizarCajaChica(id_cajaChica);
        return actualizarCajaChica;
    }

    @Override
    public TCajaChica listarPorIdCajaChica(Long id_cajaChica) {
        TCajaChica listarPorId = cajaChicaDao.listarPorIdCajaChica(id_cajaChica);
        return listarPorId;
    }  
}
