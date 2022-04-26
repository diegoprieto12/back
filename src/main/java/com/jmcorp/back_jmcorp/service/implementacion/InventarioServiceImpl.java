package com.jmcorp.back_jmcorp.service.implementacion;
import java.util.List;

import com.jmcorp.back_jmcorp.dao.InventarioDao;
import com.jmcorp.back_jmcorp.model.TInventario;
import com.jmcorp.back_jmcorp.service.InventarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventarioServiceImpl implements InventarioService{
    
    @Autowired
    InventarioDao inventarioDao;

    @Override
    public TInventario crearInventario(TInventario inventario) {
        TInventario crearInventario = inventarioDao.crearInventario(inventario);
        return crearInventario;
    }

    @Override
    public List<TInventario> listarInventario() {
        List<TInventario> listarInventario = inventarioDao.listarInventario();
        return listarInventario;
    }

    @Override
    public void eliminarInventario(Long id_inventario) throws Exception {
        inventarioDao.eliminarInventario(id_inventario);
    }

    @Override
    public TInventario actualizarInventario(Long id_inventario) {
        TInventario actualizarInventario = inventarioDao.actualizarInventario(id_inventario);
        return actualizarInventario;
    }

    @Override
    public TInventario listarPorIdInventario(Long id_inventario) {
        TInventario listarPorId = inventarioDao.listarPorIdInventario(id_inventario);
        return listarPorId;
    }

}