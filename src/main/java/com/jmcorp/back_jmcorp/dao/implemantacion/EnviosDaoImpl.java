
package com.jmcorp.back_jmcorp.dao.implemantacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.EnviosDao;
import com.jmcorp.back_jmcorp.model.TEnvios;
import com.jmcorp.back_jmcorp.repository.EnviosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EnviosDaoImpl implements EnviosDao {

    @Autowired
    EnviosRepository enviosRepository;

    @Override
    public TEnvios crearEnvios(TEnvios envios) {
        TEnvios crearEnvios = enviosRepository.save(envios);
        return crearEnvios;
    }

    @Override
    public List<TEnvios> listarEnvios() {
        List<TEnvios> listarEnvios = enviosRepository.findAll();
        return listarEnvios;
    }

    @Override
    public void eliminarEnvios(Long id_envios) throws Exception {
        enviosRepository.deleteById(id_envios);
    }

    @Override
    public TEnvios actualizarEnvios(Long id_envios) {
        TEnvios actualizarEnvios = enviosRepository.getById(id_envios);
        return actualizarEnvios;
    }

    @Override
    public TEnvios listarPorIdEnvios(Long id_envios) {
        TEnvios listarPorId = enviosRepository.getById(id_envios);
        return listarPorId;
    }

}