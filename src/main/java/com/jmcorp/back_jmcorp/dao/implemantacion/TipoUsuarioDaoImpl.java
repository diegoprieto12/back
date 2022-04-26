package com.jmcorp.back_jmcorp.dao.implemantacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.TipoUsuarioDao;
import com.jmcorp.back_jmcorp.model.TTipoUsuario;
import com.jmcorp.back_jmcorp.repository.TipoUsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TipoUsuarioDaoImpl implements TipoUsuarioDao {

    @Autowired
    TipoUsuarioRepository tipoUsuarioRepository;

    @Override
    public TTipoUsuario crearTipoUsuario(TTipoUsuario tipo_usuario) {
        TTipoUsuario crearTipoUsuario = tipoUsuarioRepository.save(tipo_usuario);
        return crearTipoUsuario;
    }

    @Override
    public List<TTipoUsuario> listarTipoUsuario() {
        List<TTipoUsuario> listarTipoUsuario = tipoUsuarioRepository.findAll();
        return listarTipoUsuario;
    }

    @Override
    public void eliminarTipoUsuario(Long id_tipo_usuario) throws Exception {
        tipoUsuarioRepository.deleteById(id_tipo_usuario);

    }

    @Override
    public TTipoUsuario actualizarTipoUsuario(Long id_tipo_usuario) {
        TTipoUsuario actualizarTipoUsuario = tipoUsuarioRepository.getById(id_tipo_usuario);
        return actualizarTipoUsuario;
    }

    @Override
    public TTipoUsuario listarPorIdTipoUsuario(Long id_tipo_usuario) {
        TTipoUsuario listarPorId = tipoUsuarioRepository.getById(id_tipo_usuario);
        return listarPorId;
    }

}