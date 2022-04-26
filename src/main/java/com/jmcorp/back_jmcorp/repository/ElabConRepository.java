package com.jmcorp.back_jmcorp.repository;

import java.util.List;

import com.jmcorp.back_jmcorp.model.TElabCon;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ElabConRepository extends JpaRepository<TElabCon, Long>{
    
    /*@Query("select * from elab_con where id_producto= :id")
    List<TElabCon> findByIdProd(Long id);*/
}
