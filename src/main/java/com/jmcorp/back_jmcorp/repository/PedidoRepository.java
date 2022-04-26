package com.jmcorp.back_jmcorp.repository;

import com.jmcorp.back_jmcorp.model.TPedido;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<TPedido, Long> {
    
}
