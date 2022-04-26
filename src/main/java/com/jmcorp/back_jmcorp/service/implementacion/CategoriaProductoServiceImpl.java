package com.jmcorp.back_jmcorp.service.implementacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.CategoriaProductoDao;
import com.jmcorp.back_jmcorp.model.TCategoriaProducto;
import com.jmcorp.back_jmcorp.service.CategoriaProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaProductoServiceImpl implements CategoriaProductoService {

    @Autowired
    CategoriaProductoDao categoriaProductoDao;

    @Override
    public TCategoriaProducto crearCategoriaProducto(TCategoriaProducto categoria_producto) {
        TCategoriaProducto crearCategoriaProducto = categoriaProductoDao.crearCategoriaProducto(categoria_producto);
        return crearCategoriaProducto;
    }

    @Override
    public List<TCategoriaProducto> listarCategoriaProducto() {
        List<TCategoriaProducto> listarCategoriaProducto = categoriaProductoDao.listarCategoriaProducto();
        return listarCategoriaProducto;
    }

    @Override
    public void eliminarCategoriaProducto(Long id_cat_producto) throws Exception {
        categoriaProductoDao.eliminarCategoriaProducto(id_cat_producto);
    }

    @Override
    public TCategoriaProducto actualizarCategoriaProducto(Long id_cat_producto) {
        TCategoriaProducto actualizarCategoriaProducto = categoriaProductoDao
                .actualizarCategoriaProducto(id_cat_producto);
        return actualizarCategoriaProducto;
    }

    @Override
    public TCategoriaProducto listarPorIdCategoriaProducto(Long id_cat_producto) {
        TCategoriaProducto listarPorId = categoriaProductoDao.listarPorIdCategoriaProducto(id_cat_producto);
        return listarPorId;
    }
}