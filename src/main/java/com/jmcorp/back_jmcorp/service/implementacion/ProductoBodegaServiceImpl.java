package com.jmcorp.back_jmcorp.service.implementacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.ProductoBodegaDao;
import com.jmcorp.back_jmcorp.model.TProductoBodega;
import com.jmcorp.back_jmcorp.service.ProductoBodegaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoBodegaServiceImpl implements ProductoBodegaService {

    @Autowired
    ProductoBodegaDao productoBodegaDao;

    @Override
    public TProductoBodega crearProductoBodega(TProductoBodega producto_bodega) {
        TProductoBodega crearProductoBodega = productoBodegaDao.crearProductoBodega(producto_bodega);
        return crearProductoBodega;
    }

    @Override
    public List<TProductoBodega> listarProductoBodega() {
        List<TProductoBodega> listarProductoBodega = productoBodegaDao.listarProductoBodega();
        return listarProductoBodega;
    }

    @Override
    public void eliminarProductoBodega(Long id_producto_bodega) throws Exception {
        productoBodegaDao.eliminarProductoBodega(id_producto_bodega);
    }

    @Override
    public TProductoBodega actualizarProductoBodega(Long id_producto_bodega) {
        TProductoBodega actualizarProductoBodega = productoBodegaDao.actualizarProductoBodega(id_producto_bodega);
        return actualizarProductoBodega;
    }

    @Override
    public TProductoBodega listarPorIdProductoBodega(Long id_producto_bodega) {
        TProductoBodega listarPorId = productoBodegaDao.listarPorIdProductoBodega(id_producto_bodega);
        return listarPorId;
    }

}