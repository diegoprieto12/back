package com.jmcorp.back_jmcorp.repository;

import com.jmcorp.back_jmcorp.controller.Timagen;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImagenRepository  extends JpaRepository<Timagen, Long> {
    Optional<Timagen> findByName(Long id_imagen);//String name);
    //Optional<Timagen> findById_imagen(Long id_imagen);
}
