package com.jmcorp.back_jmcorp.dao.implemantacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.InventarioDao;
import com.jmcorp.back_jmcorp.model.TInventario;
import com.jmcorp.back_jmcorp.repository.InventarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class InventarioDaoImpl implements InventarioDao{

    @Autowired
    InventarioRepository inventarioRepository;

    @Override
    public TInventario crearInventario(TInventario inventario) {
        TInventario crearInventario = inventarioRepository.save(inventario);
        return crearInventario;
    }

    @Override
    public List<TInventario> listarInventario() {
        List<TInventario> listarInventario = inventarioRepository.findAll();
        return listarInventario;
    }

    @Override
    public void eliminarInventario(Long id_inventario) throws Exception {
        inventarioRepository.deleteById(id_inventario);
    }

    @Override
    public TInventario actualizarInventario(Long id_inventario) {
        TInventario actualizarInventario = inventarioRepository.getById(id_inventario);
        return actualizarInventario;
    }

    @Override
    public TInventario listarPorIdInventario(Long id_inventario) {
        TInventario listarPorId = inventarioRepository.getById(id_inventario);
        return listarPorId;
    }


}
