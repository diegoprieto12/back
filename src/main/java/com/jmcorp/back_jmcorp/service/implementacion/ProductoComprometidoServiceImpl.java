package com.jmcorp.back_jmcorp.service.implementacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.ProductoComprometidoDao;
import com.jmcorp.back_jmcorp.model.TProductoComprometido;
import com.jmcorp.back_jmcorp.service.ProductoComprometidoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoComprometidoServiceImpl implements ProductoComprometidoService {

    @Autowired
    ProductoComprometidoDao productoComprometidoDao;

    @Override
    public TProductoComprometido crearProductoComprometido(TProductoComprometido producto_comprometido) {
        TProductoComprometido crearProductoComprometido = productoComprometidoDao
                .crearProductoComprometido(producto_comprometido);
        return crearProductoComprometido;
    }

    @Override
    public List<TProductoComprometido> listarProductoComprometido() {
        List<TProductoComprometido> listarProductoComprometido = productoComprometidoDao.listarProductoComprometido();
        return listarProductoComprometido;
    }

    @Override
    public void eliminarProductoComprometido(Long id_producto_comprometido) throws Exception {
        productoComprometidoDao.eliminarProductoComprometido(id_producto_comprometido);

    }

    @Override
    public TProductoComprometido actualizarProductoComprometido(Long id_producto_comprometido) {
        TProductoComprometido actualizarProductoComprometido = productoComprometidoDao
                .actualizarProductoComprometido(id_producto_comprometido);
        return actualizarProductoComprometido;
    }

    @Override
    public TProductoComprometido listarPorIdProductoComprometido(Long id_producto_comprometido) {
        TProductoComprometido listarPorIdProductoComprometido = productoComprometidoDao
                .listarPorIdProductoComprometido(id_producto_comprometido);
        return listarPorIdProductoComprometido;
    }

}