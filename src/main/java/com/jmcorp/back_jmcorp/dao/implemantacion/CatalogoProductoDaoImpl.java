package com.jmcorp.back_jmcorp.dao.implemantacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.CatalogoProductoDao;
import com.jmcorp.back_jmcorp.model.TCatalogoProducto;
import com.jmcorp.back_jmcorp.repository.CatalogoProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CatalogoProductoDaoImpl implements CatalogoProductoDao {

    @Autowired
    CatalogoProductoRepository catalogoProductoRepository;

    @Override
    public TCatalogoProducto crearCatalogoProducto(TCatalogoProducto catalogo_producto) {
        TCatalogoProducto crearCatalogoProducto = catalogoProductoRepository.save(catalogo_producto);
        return crearCatalogoProducto;
    }

    @Override
    public List<TCatalogoProducto> listarCatalogoProducto() {
        List<TCatalogoProducto> listarCatalogoProducto = catalogoProductoRepository.findAll();
        return listarCatalogoProducto;
    }

    @Override
    public void eliminarCatalogoProducto(Long id_catalogo) throws Exception {
        catalogoProductoRepository.deleteById(id_catalogo);
    }

    @Override
    public TCatalogoProducto actualizarCatalogoProducto(Long id_catalogo) {
        TCatalogoProducto actualizCatalogoProducto = catalogoProductoRepository.getById(id_catalogo);
        return actualizCatalogoProducto;
    }

    @Override
    public TCatalogoProducto listarPorIdCatalogoProducto(Long id_catalogo) {
        TCatalogoProducto listarPorId = catalogoProductoRepository.getById(id_catalogo);
        return listarPorId;
    }

}