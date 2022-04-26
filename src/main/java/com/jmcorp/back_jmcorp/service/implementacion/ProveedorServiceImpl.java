package com.jmcorp.back_jmcorp.service.implementacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.ProveedorDao;
import com.jmcorp.back_jmcorp.model.TProveedor;
import com.jmcorp.back_jmcorp.service.ProveedorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProveedorServiceImpl implements ProveedorService {

    @Autowired
    ProveedorDao proveedorDao;

    @Override
    public TProveedor crearProveedor(TProveedor proveedor) {
        TProveedor crearProveedor = proveedorDao.crearProveedor(proveedor);
        return crearProveedor;
    }

    @Override
    public List<TProveedor> listarProveedor() {
        List<TProveedor> listarProveedor = proveedorDao.listarProveedor();
        return listarProveedor;
    }

    @Override
    public void eliminarProveedor(Long id_proveedor) throws Exception {
        proveedorDao.eliminarProveedor(id_proveedor);

    }

    @Override
    public TProveedor actualizarProveedor(Long id_proveedor) {
        TProveedor actualizarProveedor = proveedorDao.actualizarProveedor(id_proveedor);
        return actualizarProveedor;
    }

    @Override
    public TProveedor listarPorIdProveedor(Long id_proveedor) {
        TProveedor listarPorId = proveedorDao.listarPorIdProveedor(id_proveedor);
        return listarPorId;
    }

}
