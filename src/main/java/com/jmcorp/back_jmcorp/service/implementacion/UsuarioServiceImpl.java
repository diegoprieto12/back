package com.jmcorp.back_jmcorp.service.implementacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.UsuarioDao;
import com.jmcorp.back_jmcorp.model.TUsuario;
import com.jmcorp.back_jmcorp.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioDao usuarioDao;

    @Override
    public TUsuario crearUsuario(TUsuario usuario) {
        TUsuario crearUsuario = usuarioDao.crearUsuario(usuario);
        return crearUsuario;
    }

    @Override
    public List<TUsuario> listarUsuario() {
        List<TUsuario> listarUsuario = usuarioDao.listarUsuario();
        return listarUsuario;
    }

    @Override
    public void eliminarUsuario(Long id_usuario) throws Exception {
        usuarioDao.eliminarUsuario(id_usuario);
    }

    @Override
    public TUsuario actualizarUsuario(Long id_usuario) {
        TUsuario actualizarUsuario = usuarioDao.actualizarUsuario(id_usuario);
        return actualizarUsuario;
    }

    @Override
    public TUsuario listarPorIdUsuario(Long id_usuario) {
        TUsuario listarPorId = usuarioDao.listarPorIdUsuario(id_usuario);
        return listarPorId;
    }

}
