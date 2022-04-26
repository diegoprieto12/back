package com.jmcorp.back_jmcorp.service.implementacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.CategoriaArticuloDao;
import com.jmcorp.back_jmcorp.model.TCategoriaArticulo;
import com.jmcorp.back_jmcorp.service.CategoriaArticuloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaArticuloServiceImpl implements CategoriaArticuloService {

    @Autowired
    CategoriaArticuloDao categoriaArticuloDao;

    @Override
    public TCategoriaArticulo crearCategoriaArticulo(TCategoriaArticulo categoria_articulo) {
        TCategoriaArticulo crearcategoriaArticulo = categoriaArticuloDao.crearCategoriaArticulo(categoria_articulo);
        return crearcategoriaArticulo;
    }

    @Override
    public List<TCategoriaArticulo> listarCategoriaArticulo() {
        List<TCategoriaArticulo> listarCategoriaArticulos = categoriaArticuloDao.listarCategoriaArticulo();
        return listarCategoriaArticulos;
    }

    @Override
    public void eliminarCategoriaArticulo(Long id_cat_articulo) throws Exception {
        categoriaArticuloDao.eliminarCategoriaArticulo(id_cat_articulo);
    }

    @Override
    public TCategoriaArticulo actualizarCategoriaArticulo(Long id_cat_articulo) {
        TCategoriaArticulo actualizaCategoriaArticulo = categoriaArticuloDao
                .actualizarCategoriaArticulo(id_cat_articulo);
        return actualizaCategoriaArticulo;
    }

    @Override
    public TCategoriaArticulo listarPorIdCategoriaArticulo(Long id_cat_articulo) {
        TCategoriaArticulo listarPorId = categoriaArticuloDao.listarPorIdCategoriaArticulo(id_cat_articulo);
        return listarPorId;
    }

}