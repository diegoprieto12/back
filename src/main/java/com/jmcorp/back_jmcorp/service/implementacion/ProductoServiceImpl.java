package com.jmcorp.back_jmcorp.service.implementacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.ProductoDao;
import com.jmcorp.back_jmcorp.model.TProducto;
import com.jmcorp.back_jmcorp.service.ProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    ProductoDao productoDao;

    @Override
    public TProducto crearProducto(TProducto producto) {
        TProducto listarProducto = productoDao.crearProducto(producto);
        return listarProducto;
    }

    @Override
    public List<TProducto> listarProducto() {
        List<TProducto> listarProducto = productoDao.listarProducto();
        return listarProducto;
    }

    @Override
    public void eliminarProducto(Long id_producto) throws Exception {
        productoDao.eliminarProducto(id_producto);

    }

    @Override
    public TProducto actualizarProducto(Long id_producto) {
        TProducto actualizarProducto = productoDao.actualizarProducto(id_producto);
        return actualizarProducto;
    }

    @Override
    public TProducto listarPorIdProducto(Long id_producto) {
        TProducto listarPorId = productoDao.listarPorIdProducto(id_producto);
        return listarPorId;
    }

}