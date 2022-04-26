package com.jmcorp.back_jmcorp.repository;

import com.jmcorp.back_jmcorp.model.TDetallePedido;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DetallePedidoRepository extends JpaRepository<TDetallePedido, Long>{
    
}
