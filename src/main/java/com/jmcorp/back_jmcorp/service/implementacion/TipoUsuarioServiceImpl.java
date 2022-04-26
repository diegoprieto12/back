package com.jmcorp.back_jmcorp.service.implementacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.TipoUsuarioDao;
import com.jmcorp.back_jmcorp.model.TTipoUsuario;
import com.jmcorp.back_jmcorp.service.TipoUsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoUsuarioServiceImpl implements TipoUsuarioService {
    @Autowired
    TipoUsuarioDao tipoUsuarioDao;

    @Override
    public TTipoUsuario crearTipoUsuario(TTipoUsuario tipo_usuario) {
        TTipoUsuario crearTipoUsuario = tipoUsuarioDao.crearTipoUsuario(tipo_usuario);
        return crearTipoUsuario;
    }

    @Override
    public List<TTipoUsuario> listarTipoUsuario() {
        List<TTipoUsuario> listarTipoUsuario = tipoUsuarioDao.listarTipoUsuario();
        return listarTipoUsuario;
    }

    @Override
    public void eliminarTipoUsuario(Long id_tipo_usuario) throws Exception {
        tipoUsuarioDao.eliminarTipoUsuario(id_tipo_usuario);

    }

    @Override
    public TTipoUsuario actualizarTipoUsuario(Long id_tipo_usuario) {
        TTipoUsuario actualizaTipoUsuario = tipoUsuarioDao.actualizarTipoUsuario(id_tipo_usuario);
        return actualizaTipoUsuario;
    }

    @Override
    public TTipoUsuario listarPorIdTipoUsuario(Long id_tipo_usuario) {
        TTipoUsuario listarPorId = tipoUsuarioDao.listarPorIdTipoUsuario(id_tipo_usuario);
        return listarPorId;
    }

}