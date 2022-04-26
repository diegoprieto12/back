package com.jmcorp.back_jmcorp.dao.implemantacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.ProveedorDao;
import com.jmcorp.back_jmcorp.model.TProveedor;
import com.jmcorp.back_jmcorp.repository.ProveedorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProveedorDaoImpl implements ProveedorDao {

    @Autowired
    ProveedorRepository proveedorRepository;

    @Override
    public TProveedor crearProveedor(TProveedor proveedor) {
        TProveedor crearProveedor = proveedorRepository.save(proveedor);
        return crearProveedor;
    }

    @Override
    public List<TProveedor> listarProveedor() {
        List<TProveedor> listarProveedor = proveedorRepository.findAll();
        return listarProveedor;
    }

    @Override
    public void eliminarProveedor(Long id_proveedor) throws Exception {
        proveedorRepository.deleteById(id_proveedor);

    }

    @Override
    public TProveedor actualizarProveedor(Long id_proveedor) {
        TProveedor actualizarProveedor = proveedorRepository.getById(id_proveedor);
        return actualizarProveedor;
    }

    @Override
    public TProveedor listarPorIdProveedor(Long id_proveedor) {
        TProveedor listarPorId = proveedorRepository.getById(id_proveedor);
        return listarPorId;
    }
}
