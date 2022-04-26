package com.jmcorp.back_jmcorp.dao.implemantacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.DestinatarioDao;
import com.jmcorp.back_jmcorp.model.TDestinatario;
import com.jmcorp.back_jmcorp.repository.DestinatarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DestinatarioDaoImpl implements DestinatarioDao {

    @Autowired
    DestinatarioRepository destinatarioRepository;

    @Override
    public TDestinatario crearDestinatario(TDestinatario destinatario) {
        TDestinatario crearDestinatario = destinatarioRepository.save(destinatario);
        return crearDestinatario;
    }

    @Override
    public List<TDestinatario> listarDestinatario() {
        List<TDestinatario> listarDestinatario = destinatarioRepository.findAll();
        return listarDestinatario;
    }

    @Override
    public void eliminarDestinatario(Long id_destinatario) throws Exception {
        destinatarioRepository.deleteById(id_destinatario);

    }

    @Override
    public TDestinatario actualizarDestinatario(Long id_destinatario) {
        TDestinatario actualizarDestinatario = destinatarioRepository.getById(id_destinatario);
        return actualizarDestinatario;
    }

    @Override
    public TDestinatario listarPorIdDestinatario(Long id_destinatario) {
        TDestinatario listarPorId = destinatarioRepository.getById(id_destinatario);
        return listarPorId;
    }

}