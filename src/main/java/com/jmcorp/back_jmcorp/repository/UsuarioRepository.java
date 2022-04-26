package com.jmcorp.back_jmcorp.repository;

import com.jmcorp.back_jmcorp.model.TUsuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsuarioRepository extends JpaRepository<TUsuario, Long> {

    // @Query(value = "Select t from TUsuario t where t.tPersona.id_persona = :id")
    // TUsuario findByUsuarioNombreYUsuarioContrasenia(String nombre_usuario, String
    // pass_usuario);
}
