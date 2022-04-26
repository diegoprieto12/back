package com.jmcorp.back_jmcorp.controller;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TPersona;
import com.jmcorp.back_jmcorp.service.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    
    @Autowired
	PersonaService personaService;

    @GetMapping("/listarPersona")
	public List<TPersona> listarPersona(){
		return personaService.listarPersona();
	}

    

    @GetMapping("/listarPersonaPorId/{id_persona}")
	public ResponseEntity<TPersona> listarId(@RequestParam ("id_persona") Long id_persona) {
		//TPersona persona = personaService.listarPorIdPersona(id_persona);
		 
			return ResponseEntity.ok(personaService.listarPorIdPersona(id_persona));
		 
	}

    @PostMapping("/crearPersona")
	@ResponseBody
	public TPersona crearPersona(@RequestBody TPersona persona) {
		return this.personaService.crearPersona(persona);
	}

    @DeleteMapping(value = "/eliminarPersona/{id_persona}")
    public void eliminarPersona(@PathVariable Long id_persona){
        try {
            personaService.eliminarPersona(id_persona);
        } catch (Exception e) {
            System.out.println("Error al eliminar la persona");
        }
    }

    @PutMapping("/actualizarPersona/{id_persona}")
    public TPersona actualizarPersona(@RequestBody TPersona persona){
        TPersona actualizarPersona = personaService.actualizarPersona(persona.getId_persona());
        actualizarPersona.setNombre_persona(persona.getNombre_persona());
        actualizarPersona.setApellido_persona(persona.getApellido_persona());
        actualizarPersona.setTelefono_persona(persona.getTelefono_persona());
        actualizarPersona.setCorreo_persona(persona.getCorreo_persona());
        actualizarPersona.setDireccion_persona(persona.getDireccion_persona());
		personaService.crearPersona(actualizarPersona);
        return actualizarPersona;    
    }

}
