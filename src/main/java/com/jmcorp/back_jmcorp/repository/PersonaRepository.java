package com.jmcorp.back_jmcorp.repository;

import com.jmcorp.back_jmcorp.model.TPersona;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<TPersona, Long>{
  
}
