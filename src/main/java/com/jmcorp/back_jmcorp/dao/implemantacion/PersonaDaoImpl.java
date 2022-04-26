package com.jmcorp.back_jmcorp.dao.implemantacion;

import java.util.List;

import com.jmcorp.back_jmcorp.dao.PersonaDao;
import com.jmcorp.back_jmcorp.model.TPersona;
import com.jmcorp.back_jmcorp.repository.PersonaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonaDaoImpl implements PersonaDao{

    @Autowired
	PersonaRepository personaRepository;
    
    @Override
    public TPersona crearPersona(TPersona persona) {
        TPersona crearPersona = personaRepository.save(persona);		
		return crearPersona;
    }

    @Override
    public List<TPersona> listarPersona() {
        List<TPersona> listarPersona = personaRepository.findAll();
        return listarPersona;
    }

    @Override
    public void eliminarPersona(Long id_persona) throws Exception {
        personaRepository.deleteById(id_persona);   
    }

    @Override
    public TPersona actualizarPersona(Long id_persona) {
        TPersona actualizarPersona = personaRepository.getById(id_persona);
		return actualizarPersona;
    }

    @Override
    public TPersona listarPorIdPersona(Long id_persona) {
        TPersona listarPorId = personaRepository.getById(id_persona);
		return listarPorId;
    }
    
}
