package com.jmcorp.back_jmcorp.service.implementacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.CatalogoProductoDao;
import com.jmcorp.back_jmcorp.model.TCatalogoProducto;
import com.jmcorp.back_jmcorp.service.CatalogoProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogoProductoServiceImpl implements CatalogoProductoService {

    @Autowired
    CatalogoProductoDao catalogoProductoDao;

    @Override
    public TCatalogoProducto crearCatalogoProducto(TCatalogoProducto catalogo_producto) {
        TCatalogoProducto crearCatalogoProducto = catalogoProductoDao.crearCatalogoProducto(catalogo_producto);
        return crearCatalogoProducto;
    }

    @Override
    public List<TCatalogoProducto> listarCatalogoProducto() {
        List<TCatalogoProducto> listarCatalogoProducto = catalogoProductoDao.listarCatalogoProducto();
        return listarCatalogoProducto;
    }

    @Override
    public void eliminarCatalogoProducto(Long id_catalogo) throws Exception {
        catalogoProductoDao.eliminarCatalogoProducto(id_catalogo);
    }

    @Override
    public TCatalogoProducto actualizarCatalogoProducto(Long id_catalogo) {
        TCatalogoProducto actualizarCatalogoProducto = catalogoProductoDao.actualizarCatalogoProducto(id_catalogo);
        return actualizarCatalogoProducto;
    }

    @Override
    public TCatalogoProducto listarPorIdCatalogoProducto(Long id_catalogo) {
        TCatalogoProducto listarCatalogoProducto = catalogoProductoDao.listarPorIdCatalogoProducto(id_catalogo);
        return listarCatalogoProducto;
    }

}