package com.jmcorp.back_jmcorp.dao.implemantacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.OrdenProdDao;
import com.jmcorp.back_jmcorp.model.TOrdenProd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.jmcorp.back_jmcorp.repository.OrdenProdRepository;

@Repository
public class OrdenProdDaoImpl implements OrdenProdDao{
    @Autowired
    OrdenProdRepository ordenProdRepository;

    @Override
    public TOrdenProd crearOrdenProd(TOrdenProd orden_Prod) {
        TOrdenProd crearOrdenProd = ordenProdRepository.save(orden_Prod);
        return crearOrdenProd;
    }

    @Override
    public List<TOrdenProd> listarOrdenProd() {
        List<TOrdenProd> listarOrdenProd = ordenProdRepository.findAll();
        return listarOrdenProd;
    }

    @Override
    public void eliminarOrdenProd(Long id_orden_Prod) throws Exception {
        ordenProdRepository.deleteById(id_orden_Prod);

    }

    @Override
    public TOrdenProd actualizarOrdenProd(Long id_orden_Prod) {
        TOrdenProd actualizarOrdenProd = ordenProdRepository.getById(id_orden_Prod);
        return actualizarOrdenProd;
    }

    @Override
    public TOrdenProd listarPorIdOrdenProd(Long id_orden_Prod) {
        TOrdenProd listarPorId = ordenProdRepository.getById(id_orden_Prod);
        return listarPorId;
    }

}
