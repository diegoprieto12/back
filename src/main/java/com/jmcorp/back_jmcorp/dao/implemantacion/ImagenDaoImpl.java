package com.jmcorp.back_jmcorp.dao.implemantacion;

import java.util.List;

import com.jmcorp.back_jmcorp.controller.Timagen;
import com.jmcorp.back_jmcorp.dao.ImagenDao;
import com.jmcorp.back_jmcorp.repository.ImagenRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ImagenDaoImpl implements ImagenDao{
    @Autowired
    ImagenRepository imagenRepository;

    @Override
    public Timagen crearImagen(Timagen imagen) {
        Timagen crearImagen = imagenRepository.save(imagen);
        return crearImagen;
    }

    @Override
    public List<Timagen> listarImagen() {
        List<Timagen> listarImagen = imagenRepository.findAll();
        return listarImagen;
    }

    @Override
    public void eliminarImagen(Long id_imagen) throws Exception {
        imagenRepository.deleteById(id_imagen);

    }

    @Override
    public Timagen actualizarImagen(Long id_imagen) {
        Timagen actualizarImagen = imagenRepository.getById(id_imagen);
        return actualizarImagen;
    }

    @Override
    public Timagen listarPorIdImagen(Long id_imagen) {
        Timagen listarPorId = imagenRepository.getById(id_imagen);
        return listarPorId;
    }

}