package com.jmcorp.back_jmcorp.dao.implemantacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.ElabConDao;
import com.jmcorp.back_jmcorp.model.TElabCon;
import com.jmcorp.back_jmcorp.repository.ElabConRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ElabConDaoImpl implements ElabConDao{

    @Autowired
    ElabConRepository elabConRepository;

    @Override
    public TElabCon crearElabcon(TElabCon elabcon) {
        TElabCon crearElabcon = elabConRepository.save(elabcon);
        return crearElabcon;
    }

    @Override
    public List<TElabCon> listarElabCon() {
        List<TElabCon> listarElabCon = elabConRepository.findAll();
        return listarElabCon;
    }

    @Override
    public void eliminarElabCon(Long id_elab_con) throws Exception {
        elabConRepository.deleteById(id_elab_con);
        
    }

    @Override
    public TElabCon actualizarElabCon(Long id_elab_con) {
        TElabCon actualizarelabcon = elabConRepository.getById(id_elab_con);
        return actualizarelabcon;
    }

    @Override
    public TElabCon listarPorIdElabCon(Long id_elab_con) {
        TElabCon listarPorIdElabCon = elabConRepository.getById(id_elab_con);
        return listarPorIdElabCon;
    }

    
}
