package com.jmcorp.back_jmcorp.service.implementacion;

import java.util.List;

import com.jmcorp.back_jmcorp.controller.Timagen;
import com.jmcorp.back_jmcorp.dao.ImagenDao;
import com.jmcorp.back_jmcorp.service.ImagenService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImagenServiceImpl implements ImagenService{
    @Autowired
    ImagenDao imagenDao;

    @Override
    public Timagen crearImagen(Timagen imagen) {
        Timagen listarImagen = imagenDao.crearImagen(imagen);
        return listarImagen;
    }

    @Override
    public List<Timagen> listarImagen() {
        List<Timagen> listarImagen = imagenDao.listarImagen();
        return listarImagen;
    }

    @Override
    public void eliminarImagen(Long id_imagen) throws Exception {
        imagenDao.eliminarImagen(id_imagen);

    }

    @Override
    public Timagen actualizarImagen(Long id_imagen) {
        Timagen actualizarImagen = imagenDao.actualizarImagen(id_imagen);
        return actualizarImagen;
    }

    @Override
    public Timagen listarPorIdImagen(Long id_imagen) {
        Timagen listarPorId = imagenDao.listarPorIdImagen(id_imagen);
        return listarPorId;
    }

}