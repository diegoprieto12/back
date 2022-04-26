package com.jmcorp.back_jmcorp.dao.implemantacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.UsuarioDao;
import com.jmcorp.back_jmcorp.model.TUsuario;
import com.jmcorp.back_jmcorp.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioDaoImpl implements UsuarioDao {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public TUsuario crearUsuario(TUsuario usuario) {
        TUsuario crearUsuario = usuarioRepository.save(usuario);
        return crearUsuario;
    }

    @Override
    public List<TUsuario> listarUsuario() {
        List<TUsuario> listarUsuario = usuarioRepository.findAll();
        return listarUsuario;
    }

    @Override
    public void eliminarUsuario(Long id_usuario) throws Exception {
        usuarioRepository.deleteById(id_usuario);
    }

    @Override
    public TUsuario actualizarUsuario(Long id_usuario) {
        TUsuario actualizarUsuario = usuarioRepository.getById(id_usuario);
        return actualizarUsuario;
    }

    @Override
    public TUsuario listarPorIdUsuario(Long id_usuario) {
        TUsuario listarPorId = usuarioRepository.getById(id_usuario);
        return listarPorId;
    }

}
