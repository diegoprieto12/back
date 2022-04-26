package com.jmcorp.back_jmcorp.service.implementacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.LocalDao;
import com.jmcorp.back_jmcorp.model.TLocal;
import com.jmcorp.back_jmcorp.service.LocalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalServiceImpl implements LocalService {

    @Autowired
    LocalDao localDao;

    @Override
    public TLocal crearLocal(TLocal local) {
        TLocal creaLocal = localDao.crearLocal(local);
        return creaLocal;
    }

    @Override
    public List<TLocal> listarLocal() {
        List<TLocal> listarLocal = localDao.listarLocal();
        return listarLocal;
    }

    @Override
    public void eliminarLocal(Long id_local) throws Exception {
        localDao.eliminarLocal(id_local);

    }

    @Override
    public TLocal actualizarLocal(Long id_local) {
        TLocal actualizarLocal = localDao.actualizarLocal(id_local);
        return actualizarLocal;
    }

    @Override
    public TLocal listarPorIdLocal(Long id_local) {
        TLocal listarPorId = localDao.actualizarLocal(id_local);
        return listarPorId;
    }

}