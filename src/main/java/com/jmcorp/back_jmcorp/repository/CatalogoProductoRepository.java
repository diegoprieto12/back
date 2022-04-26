package com.jmcorp.back_jmcorp.repository;

import com.jmcorp.back_jmcorp.model.TCatalogoProducto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogoProductoRepository extends JpaRepository<TCatalogoProducto, Long>{
    
    
}
