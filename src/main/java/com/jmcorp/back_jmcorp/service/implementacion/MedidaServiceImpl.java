package com.jmcorp.back_jmcorp.service.implementacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.MedidaDao;
import com.jmcorp.back_jmcorp.model.TMedida;
import com.jmcorp.back_jmcorp.service.MedidaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedidaServiceImpl implements MedidaService {

    @Autowired
    MedidaDao medidaDao;

    @Override
    public TMedida crearMedida(TMedida medida) {
        TMedida crearMedida = medidaDao.crearMedida(medida);
        return crearMedida;
    }

    @Override
    public List<TMedida> listarMedida() {
        List<TMedida> listarMedida = medidaDao.listarMedida();
        return listarMedida;
    }

    @Override
    public void eliminarMedida(Long id_medida) throws Exception {
        medidaDao.eliminarMedida(id_medida);

    }

    @Override
    public TMedida actualizarMedida(Long id_medida) {
        TMedida actualizarMedida = medidaDao.actualizarMedida(id_medida);
        return actualizarMedida;
    }

    @Override
    public TMedida listarPorIdMedida(Long id_medida) {
        TMedida listarPorId = medidaDao.listarPorIdMedida(id_medida);
        return listarPorId;
    }

}