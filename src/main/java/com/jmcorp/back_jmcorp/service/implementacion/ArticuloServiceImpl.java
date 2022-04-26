package com.jmcorp.back_jmcorp.service.implementacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.ArticuloDao;
import com.jmcorp.back_jmcorp.model.TArticulo;
import com.jmcorp.back_jmcorp.service.ArticuloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticuloServiceImpl implements ArticuloService {

    @Autowired
    ArticuloDao articuloDao;

    @Override
    public TArticulo crearArticulo(TArticulo articulo) {
        TArticulo crearArticulo = articuloDao.crearArticulo(articulo);
        return crearArticulo;
    }

    @Override
    public List<TArticulo> listarArticulo() {
        List<TArticulo> listarArticulo = articuloDao.listarArticulo();
        return listarArticulo;
    }

    @Override
    public void eliminarArticulo(Long id_articulo) throws Exception {
        articuloDao.eliminarArticulo(id_articulo);
    }

    @Override
    public TArticulo actualizarArticulo(Long id_articulo) {
        TArticulo actualizarArticulo = articuloDao.actualizarArticulo(id_articulo);
        return actualizarArticulo;
    }

    @Override
    public TArticulo listarPorIdArticulo(Long id_articulo) {
        TArticulo listarPorId = articuloDao.listarPorIdArticulo(id_articulo);
        return listarPorId;
    }

}