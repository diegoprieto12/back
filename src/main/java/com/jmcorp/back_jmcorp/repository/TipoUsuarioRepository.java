package com.jmcorp.back_jmcorp.repository;

import com.jmcorp.back_jmcorp.model.TTipoUsuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoUsuarioRepository extends JpaRepository<TTipoUsuario, Long> {
    
}
