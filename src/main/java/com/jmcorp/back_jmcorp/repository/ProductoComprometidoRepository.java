package com.jmcorp.back_jmcorp.repository;

import com.jmcorp.back_jmcorp.model.TProductoComprometido;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoComprometidoRepository extends JpaRepository<TProductoComprometido, Long>{
    
}
