package com.jmcorp.back_jmcorp.service.implementacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.ElabConDao;
import com.jmcorp.back_jmcorp.model.TElabCon;
import com.jmcorp.back_jmcorp.repository.ElabConRepository;
import com.jmcorp.back_jmcorp.service.ElabConService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElabConServiceImpl implements ElabConService{
    
    @Autowired
    ElabConDao elabConDao;
    
    @Autowired
    ElabConRepository elabConRepository;

    /*public List<TElabCon> buscarCodigoProducto(Long Pid){
        return this.elabConRepository.findByIdProd(Pid);
    }
*/
    @Override
    public TElabCon crearTElabCon(TElabCon TElabCon) {
        TElabCon crearTElabCon = elabConDao.crearElabcon(TElabCon);
        return crearTElabCon;
    }

    @Override
    public List<TElabCon> listarTElabCon() {
        List<TElabCon> listarTElabCon = elabConDao.listarElabCon();
        return listarTElabCon;
    }

    @Override
    public void eliminarTElabCon(Long id_elab_con) throws Exception {
        elabConDao.eliminarElabCon(id_elab_con);
        
    }

    @Override
    public TElabCon actualizarTElabCon(Long id_elab_con) {
        TElabCon actualizarTElabCon = elabConDao.actualizarElabCon(id_elab_con);
        return actualizarTElabCon;
    }

    @Override
    public TElabCon listarPorIdTElabCon(Long id_elab_con) {
        TElabCon listarPorIdTElabCon = elabConDao.listarPorIdElabCon(id_elab_con);
        return listarPorIdTElabCon;
    }
    
    
}
