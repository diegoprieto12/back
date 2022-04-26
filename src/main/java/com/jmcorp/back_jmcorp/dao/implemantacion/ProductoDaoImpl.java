package com.jmcorp.back_jmcorp.dao.implemantacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.ProductoDao;
import com.jmcorp.back_jmcorp.model.TProducto;
import com.jmcorp.back_jmcorp.repository.ProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductoDaoImpl implements ProductoDao {

    @Autowired
    ProductoRepository productoRepository;

    @Override
    public TProducto crearProducto(TProducto producto) {
        TProducto crearProducto = productoRepository.save(producto);
        return crearProducto;
    }

    @Override
    public List<TProducto> listarProducto() {
        List<TProducto> listarProducto = productoRepository.findAll();
        return listarProducto;
    }

    @Override
    public void eliminarProducto(Long id_producto) throws Exception {
        productoRepository.deleteById(id_producto);

    }

    @Override
    public TProducto actualizarProducto(Long id_producto) {
        TProducto actualizarProducto = productoRepository.getById(id_producto);
        return actualizarProducto;
    }

    @Override
    public TProducto listarPorIdProducto(Long id_producto) {
        TProducto listarPorId = productoRepository.getById(id_producto);
        return listarPorId;
    }

}