package com.jmcorp.back_jmcorp.dao.implemantacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.ProductoComprometidoDao;
import com.jmcorp.back_jmcorp.model.TProductoComprometido;
import com.jmcorp.back_jmcorp.repository.ProductoComprometidoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductoComprometidoDaoImpl implements ProductoComprometidoDao {

    @Autowired
    ProductoComprometidoRepository productoComprometidoRepository;

    @Override
    public TProductoComprometido crearProductoComprometido(TProductoComprometido producto_comprometido) {
        TProductoComprometido crearProductoComprometido = productoComprometidoRepository.save(producto_comprometido);
        return crearProductoComprometido;
    }

    @Override
    public List<TProductoComprometido> listarProductoComprometido() {
        List<TProductoComprometido> listarProductoComprometido = productoComprometidoRepository.findAll();
        return listarProductoComprometido;
    }

    @Override
    public void eliminarProductoComprometido(Long id_producto_comprometido) throws Exception {
        productoComprometidoRepository.deleteById(id_producto_comprometido);
    }

    @Override
    public TProductoComprometido actualizarProductoComprometido(Long id_producto_comprometido) {
        TProductoComprometido actualizarProductoComprometido = productoComprometidoRepository
                .getById(id_producto_comprometido);
        return actualizarProductoComprometido;
    }

    @Override
    public TProductoComprometido listarPorIdProductoComprometido(Long id_producto_comprometido) {
        TProductoComprometido listarPorId = productoComprometidoRepository.getById(id_producto_comprometido);
        return listarPorId;
    }

}