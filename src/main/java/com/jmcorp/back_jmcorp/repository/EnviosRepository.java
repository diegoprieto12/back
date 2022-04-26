package com.jmcorp.back_jmcorp.repository;

import com.jmcorp.back_jmcorp.model.TEnvios;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EnviosRepository extends JpaRepository<TEnvios, Long>{
    
}
