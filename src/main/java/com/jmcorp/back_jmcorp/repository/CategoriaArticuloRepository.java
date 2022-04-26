package com.jmcorp.back_jmcorp.repository;

import com.jmcorp.back_jmcorp.model.TCategoriaArticulo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaArticuloRepository extends JpaRepository<TCategoriaArticulo, Long>{
    
}
