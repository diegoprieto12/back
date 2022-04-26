package com.jmcorp.back_jmcorp.dao.implemantacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.CategoriaProductoDao;
import com.jmcorp.back_jmcorp.model.TCategoriaProducto;
import com.jmcorp.back_jmcorp.repository.CategoriaProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoriaProductoDaoImpl implements CategoriaProductoDao {

    @Autowired
    CategoriaProductoRepository categoriaProductoRepository;

    @Override
    public TCategoriaProducto crearCategoriaProducto(TCategoriaProducto categoria_producto) {
        TCategoriaProducto crearCategoriaProducto = categoriaProductoRepository.save(categoria_producto);
        return crearCategoriaProducto;
    }

    @Override
    public List<TCategoriaProducto> listarCategoriaProducto() {
        List<TCategoriaProducto> listarCategoriaProducto = categoriaProductoRepository.findAll();
        return listarCategoriaProducto;
    }

    @Override
    public void eliminarCategoriaProducto(Long id_cat_producto) throws Exception {
        categoriaProductoRepository.deleteById(id_cat_producto);

    }

    @Override
    public TCategoriaProducto actualizarCategoriaProducto(Long id_cat_producto) {
        TCategoriaProducto actualizarCategoriaProducto = categoriaProductoRepository.getById(id_cat_producto);
        return actualizarCategoriaProducto;
    }

    @Override
    public TCategoriaProducto listarPorIdCategoriaProducto(Long id_cat_producto) {
        TCategoriaProducto listarPorId = categoriaProductoRepository.getById(id_cat_producto);
        return listarPorId;
    }

}