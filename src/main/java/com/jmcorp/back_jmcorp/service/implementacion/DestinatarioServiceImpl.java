package com.jmcorp.back_jmcorp.service.implementacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.DestinatarioDao;
import com.jmcorp.back_jmcorp.model.TDestinatario;
import com.jmcorp.back_jmcorp.service.DestinatarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DestinatarioServiceImpl implements DestinatarioService {

    @Autowired
    DestinatarioDao destinatarioDao;

    @Override
    public TDestinatario crearDestinatario(TDestinatario destinatario) {
        TDestinatario crearDestinatario = destinatarioDao.crearDestinatario(destinatario);
        return crearDestinatario;
    }

    @Override
    public List<TDestinatario> listarDestinatario() {
        List<TDestinatario> listarDestinatario = destinatarioDao.listarDestinatario();
        return listarDestinatario;
    }

    @Override
    public void eliminarDestinatario(Long id_destinatario) throws Exception {
        destinatarioDao.eliminarDestinatario(id_destinatario);

    }

    @Override
    public TDestinatario actualizarDestinatario(Long id_destinatario) {
        TDestinatario actualizarDestinatario = destinatarioDao.actualizarDestinatario(id_destinatario);
        return actualizarDestinatario;
    }

    @Override
    public TDestinatario listarPorIdDestinatario(Long id_destinatario) {
        TDestinatario listarPorId = destinatarioDao.listarPorIdDestinatario(id_destinatario);
        return listarPorId;
    }

}