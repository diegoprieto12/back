package com.jmcorp.back_jmcorp.repository;

import com.jmcorp.back_jmcorp.model.TCategoriaProducto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaProductoRepository extends JpaRepository<TCategoriaProducto, Long>{
    
}
