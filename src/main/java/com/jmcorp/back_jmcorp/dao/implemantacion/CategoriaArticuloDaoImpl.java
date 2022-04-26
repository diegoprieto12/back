package com.jmcorp.back_jmcorp.dao.implemantacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.CategoriaArticuloDao;
import com.jmcorp.back_jmcorp.model.TCategoriaArticulo;
import com.jmcorp.back_jmcorp.repository.CategoriaArticuloRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoriaArticuloDaoImpl implements CategoriaArticuloDao {

    @Autowired
    CategoriaArticuloRepository categoriaArticuloRepository;

    @Override
    public TCategoriaArticulo crearCategoriaArticulo(TCategoriaArticulo categoria_articulo) {
        TCategoriaArticulo crearCategoriaArticulo = categoriaArticuloRepository.save(categoria_articulo);
        return crearCategoriaArticulo;
    }

    @Override
    public List<TCategoriaArticulo> listarCategoriaArticulo() {
        List<TCategoriaArticulo> listarCategoriaArticulo = categoriaArticuloRepository.findAll();
        return listarCategoriaArticulo;
    }

    @Override
    public void eliminarCategoriaArticulo(Long id_cat_articulo) throws Exception {
        categoriaArticuloRepository.deleteById(id_cat_articulo);
    }

    @Override
    public TCategoriaArticulo actualizarCategoriaArticulo(Long id_cat_articulo) {
        TCategoriaArticulo actualizarCategoriaArticulo = categoriaArticuloRepository.getById(id_cat_articulo);
        return actualizarCategoriaArticulo;
    }

    @Override
    public TCategoriaArticulo listarPorIdCategoriaArticulo(Long id_cat_articulo) {
        TCategoriaArticulo listarPorId = categoriaArticuloRepository.getById(id_cat_articulo);
        return listarPorId;
    }

}