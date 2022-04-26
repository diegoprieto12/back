package com.jmcorp.back_jmcorp.service.implementacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.PersonaDao;
import com.jmcorp.back_jmcorp.model.TPersona;
import com.jmcorp.back_jmcorp.service.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements PersonaService{
	
    @Autowired
	PersonaDao personaDao;

    @Override
    public TPersona crearPersona(TPersona persona) {
        TPersona crearPersona = personaDao.crearPersona(persona);
		return crearPersona;
    }

    @Override
    public List<TPersona> listarPersona() {
        List<TPersona> listarPersona = personaDao.listarPersona();
        return listarPersona;
    }

    @Override
    public void eliminarPersona(Long id_persona) throws Exception {
        personaDao.eliminarPersona(id_persona);
    }

    @Override
    public TPersona actualizarPersona(Long id_persona) {
        TPersona actualizarPersona = personaDao.actualizarPersona(id_persona);
        return actualizarPersona;
    }

    

    @Override
    public TPersona listarPorIdPersona(Long id_persona) {
        TPersona listarPorId = personaDao.listarPorIdPersona(id_persona);
		return listarPorId;
    }



}
