package com.jmcorp.back_jmcorp.repository;
import com.jmcorp.back_jmcorp.model.TInventario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarioRepository  extends JpaRepository<TInventario, Long>{
    
}
