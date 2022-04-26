package com.jmcorp.back_jmcorp.service.implementacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.EnviosDao;
import com.jmcorp.back_jmcorp.model.TEnvios;
import com.jmcorp.back_jmcorp.service.EnviosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnviosServiceImpl implements EnviosService {

    @Autowired
    EnviosDao enviosDao;

    @Override
    public TEnvios crearEnvios(TEnvios envios) {
        TEnvios creaEnvios = enviosDao.crearEnvios(envios);
        return creaEnvios;
    }

    @Override
    public List<TEnvios> listarEnvios() {
        List<TEnvios> listarEnvios = enviosDao.listarEnvios();
        return listarEnvios;
    }

    @Override
    public void eliminarEnvios(Long id_envios) throws Exception {
        enviosDao.eliminarEnvios(id_envios);
    }

    @Override
    public TEnvios actualizarEnvios(Long id_envios) {
        TEnvios actualizarEnvios = enviosDao.actualizarEnvios(id_envios);
        return actualizarEnvios;
    }

    @Override
    public TEnvios listarPorIdEnvios(Long id_envios) {
        TEnvios listarPorId = enviosDao.listarPorIdEnvios(id_envios);
        return listarPorId;
    }

}