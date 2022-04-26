package com.jmcorp.back_jmcorp.dao.implemantacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.LocalDao;
import com.jmcorp.back_jmcorp.model.TLocal;
import com.jmcorp.back_jmcorp.repository.LocalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LocalDaoImpl implements LocalDao {

    @Autowired
    LocalRepository localRepository;

    @Override
    public TLocal crearLocal(TLocal local) {
        TLocal creaLocal = localRepository.save(local);
        return creaLocal;
    }

    @Override
    public List<TLocal> listarLocal() {
        List<TLocal> listarLocal = localRepository.findAll();
        return listarLocal;
    }

    @Override
    public void eliminarLocal(Long id_local) throws Exception {
        localRepository.deleteById(id_local);

    }

    @Override
    public TLocal actualizarLocal(Long id_local) {
        TLocal actualizarLocal = localRepository.getById(id_local);
        return actualizarLocal;
    }

    @Override
    public TLocal listarPorIdLocal(Long id_local) {
        TLocal listarPorId = localRepository.getById(id_local);
        return listarPorId;
    }

}