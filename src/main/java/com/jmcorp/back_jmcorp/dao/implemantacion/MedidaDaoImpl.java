package com.jmcorp.back_jmcorp.dao.implemantacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.MedidaDao;
import com.jmcorp.back_jmcorp.model.TMedida;
import com.jmcorp.back_jmcorp.repository.MedidaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MedidaDaoImpl implements MedidaDao {

    @Autowired
    MedidaRepository medidaRepository;

    @Override
    public TMedida crearMedida(TMedida medida) {
        TMedida crearMedida = medidaRepository.save(medida);
        return crearMedida;
    }

    @Override
    public List<TMedida> listarMedida() {
        List<TMedida> listarMedida = medidaRepository.findAll();
        return listarMedida;
    }

    @Override
    public void eliminarMedida(Long id_medida) throws Exception {
        medidaRepository.deleteById(id_medida);

    }

    @Override
    public TMedida actualizarMedida(Long id_medida) {
        TMedida actualizarMedida = medidaRepository.getById(id_medida);
        return actualizarMedida;
    }

    @Override
    public TMedida listarPorIdMedida(Long id_medida) {
        TMedida listarPorId = medidaRepository.getById(id_medida);
        return listarPorId;
    }
}