package com.jmcorp.back_jmcorp.dao.implemantacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.CajachicaDao;
import com.jmcorp.back_jmcorp.model.TCajaChica;
import com.jmcorp.back_jmcorp.repository.CajachicaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CajachicaDaoImpl implements CajachicaDao{
    @Autowired
    CajachicaRepository cajaChicarepository;

    @Override
    public TCajaChica crearCajaChica(TCajaChica cajaChica) {
        TCajaChica crearCajaChica = cajaChicarepository.save(cajaChica);
        return crearCajaChica;
    }

    @Override
    public List<TCajaChica> listarCajaChica() {
        List<TCajaChica> listarCajaChica = cajaChicarepository.findAll();
        return listarCajaChica;
    }

    @Override
    public void eliminarCajaChica(Long id_cajaChica) throws Exception {
        cajaChicarepository.deleteById(id_cajaChica);

    }

    @Override
    public TCajaChica actualizarCajaChica(Long id_cajaChica) {
        TCajaChica actualizarCajaChica = cajaChicarepository.getById(id_cajaChica);
        return actualizarCajaChica;
    }

    @Override
    public TCajaChica listarPorIdCajaChica(Long id_cajaChica) {
        TCajaChica listarPorId = cajaChicarepository.getById(id_cajaChica);
        return listarPorId;
    }   
}