
package com.jmcorp.back_jmcorp.dao.implemantacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.TallerDao;
import com.jmcorp.back_jmcorp.model.TTaller;
import com.jmcorp.back_jmcorp.repository.TallerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TallerDaoImpl implements TallerDao {

    @Autowired
    TallerRepository tallerRepository;

    @Override
    public TTaller crearTaller(TTaller taller) {
        TTaller crearTaller = tallerRepository.save(taller);
        return crearTaller;
    }

    @Override
    public List<TTaller> listarTaller() {
        List<TTaller> listarTaller = tallerRepository.findAll();
        return listarTaller;
    }

    @Override
    public void eliminarTaller(Long id_taller) throws Exception {
        tallerRepository.deleteById(id_taller);
    }

    @Override
    public TTaller actualizarTaller(Long id_taller) {
        TTaller actualizarTaller = tallerRepository.getById(id_taller);
        return actualizarTaller;
    }

    @Override
    public TTaller listarPorIdTaller(Long id_taller) {
        TTaller listarTaller = tallerRepository.getById(id_taller);
        return listarTaller;
    }

}