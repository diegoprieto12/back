package com.jmcorp.back_jmcorp.repository;

import com.jmcorp.back_jmcorp.model.TCliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<TCliente, Long>{
    
}
