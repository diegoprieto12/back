package com.jmcorp.back_jmcorp.service;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TProveedor;

public interface ProveedorService {
    TProveedor crearProveedor(TProveedor proveedor);

    List<TProveedor> listarProveedor();

    void eliminarProveedor(Long id_proveedor) throws Exception;

    TProveedor actualizarProveedor(Long id_proveedor);

    TProveedor listarPorIdProveedor(Long id_proveedor);
}
