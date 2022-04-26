package com.jmcorp.back_jmcorp.dao.implemantacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.ProductoBodegaDao;
import com.jmcorp.back_jmcorp.model.TProductoBodega;
import com.jmcorp.back_jmcorp.repository.ProductoBodegaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductoBodegaDaoImpl implements ProductoBodegaDao {

    @Autowired
    ProductoBodegaRepository productoBodegaRepository;

    @Override
    public TProductoBodega crearProductoBodega(TProductoBodega producto_bodega) {
        TProductoBodega crearProductoBodega = productoBodegaRepository.save(producto_bodega);
        return crearProductoBodega;
    }

    @Override
    public List<TProductoBodega> listarProductoBodega() {
        List<TProductoBodega> listarProductoBodegas = productoBodegaRepository.findAll();
        return listarProductoBodegas;
    }

    @Override
    public void eliminarProductoBodega(Long id_producto_bodega) throws Exception {
        productoBodegaRepository.deleteById(id_producto_bodega);
    }

    @Override
    public TProductoBodega actualizarProductoBodega(Long id_producto_bodega) {
        TProductoBodega actualizarProductoBodega = productoBodegaRepository.getById(id_producto_bodega);
        return actualizarProductoBodega;
    }

    @Override
    public TProductoBodega listarPorIdProductoBodega(Long id_producto_bodega) {
        TProductoBodega listarPorId = productoBodegaRepository.getById(id_producto_bodega);
        return listarPorId;
    }

}