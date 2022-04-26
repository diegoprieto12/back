package com.jmcorp.back_jmcorp.repository;

import com.jmcorp.back_jmcorp.model.TArticulo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloRepository extends JpaRepository<TArticulo, Long>{
    
}
