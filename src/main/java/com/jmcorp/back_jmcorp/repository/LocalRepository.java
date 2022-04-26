package com.jmcorp.back_jmcorp.repository;

import com.jmcorp.back_jmcorp.model.TLocal;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalRepository extends JpaRepository<TLocal, Long>{
    
}
