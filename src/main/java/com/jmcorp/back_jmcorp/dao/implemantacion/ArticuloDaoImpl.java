package com.jmcorp.back_jmcorp.dao.implemantacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.ArticuloDao;
import com.jmcorp.back_jmcorp.model.TArticulo;
import com.jmcorp.back_jmcorp.repository.ArticuloRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ArticuloDaoImpl implements ArticuloDao {

    @Autowired
    ArticuloRepository articuloRepository;

    @Override
    public TArticulo crearArticulo(TArticulo articulo) {
        TArticulo crearArticulo = articuloRepository.save(articulo);
        return crearArticulo;
    }

    @Override
    public List<TArticulo> listarArticulo() {
        List<TArticulo> listarArticulo = articuloRepository.findAll();
        return listarArticulo;
    }

    @Override
    public void eliminarArticulo(Long id_articulo) throws Exception {
        articuloRepository.deleteById(id_articulo);
    }

    @Override
    public TArticulo actualizarArticulo(Long id_articulo) {
        TArticulo actualizarArticulo = articuloRepository.getById(id_articulo);
        return actualizarArticulo;
    }

    @Override
    public TArticulo listarPorIdArticulo(Long id_articulo) {
        TArticulo listarPorId = articuloRepository.getById(id_articulo);
        return listarPorId;
    }

}