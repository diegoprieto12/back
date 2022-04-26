package com.jmcorp.back_jmcorp.repository;

import com.jmcorp.back_jmcorp.model.TProducto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<TProducto, Long> {
    
}
