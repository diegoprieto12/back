
package com.jmcorp.back_jmcorp.service.implementacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.TallerDao;
import com.jmcorp.back_jmcorp.model.TTaller;
import com.jmcorp.back_jmcorp.service.TallerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TallerServiceImpl implements TallerService {

    @Autowired
    TallerDao tallerDao;

    @Override
    public TTaller crearTaller(TTaller taller) {
        TTaller crearTaller = tallerDao.crearTaller(taller);
        return crearTaller;
    }

    @Override
    public List<TTaller> listarTaller() {
        List<TTaller> listarTaller = tallerDao.listarTaller();
        return listarTaller;
    }

    @Override
    public void eliminarTaller(Long id_taller) throws Exception {
        tallerDao.eliminarTaller(id_taller);
    }

    @Override
    public TTaller actualizarTaller(Long id_taller) {
        TTaller actualizarTaller = tallerDao.actualizarTaller(id_taller);
        return actualizarTaller;
    }

    @Override
    public TTaller listarPorIdTaller(Long id_taller) {
        TTaller listarTaller = tallerDao.listarPorIdTaller(id_taller);
        return listarTaller;
    }

}