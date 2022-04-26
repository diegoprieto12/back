package com.jmcorp.back_jmcorp.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "categoria_articulo")
public class TCategoriaArticulo implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqCategoriaArticulo")
    @SequenceGenerator(name = "seqCategoriaArticulo", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_CATEGORIAARTICULO_ID")
    private Long id_cat_articulo;

    private String nombre_cat_articulo;
    private Long porcentaje_ganacia_articulo;
    private Long margen_produccion_articulo;

    @OneToMany(mappedBy = "categoria_articulo")
    private List<TArticulo> articulo;

    public TCategoriaArticulo() {
    }

    public TCategoriaArticulo(Long porcentaje_ganacia_articulo, Long margen_produccion_articulo) {
        this.porcentaje_ganacia_articulo = porcentaje_ganacia_articulo;
        this.margen_produccion_articulo = margen_produccion_articulo;
    }

    public TCategoriaArticulo(Long id_cat_articulo, String nombre_cat_articulo) {
        this.id_cat_articulo = id_cat_articulo;
        this.nombre_cat_articulo = nombre_cat_articulo;
    }

    public Long getPorcentaje_ganacia_articulo() {
        return porcentaje_ganacia_articulo;
    }

    public void setPorcentaje_ganacia_articulo(Long porcentaje_ganacia_articulo) {
        this.porcentaje_ganacia_articulo = porcentaje_ganacia_articulo;
    }

    public Long getMargen_produccion_articulo() {
        return margen_produccion_articulo;
    }

    public void setMargen_produccion_articulo(Long margen_produccion_articulo) {
        this.margen_produccion_articulo = margen_produccion_articulo;
    }

    public Long getId_cat_articulo() {
        return id_cat_articulo;
    }

    public void setId_cat_articulo(Long id_cat_articulo) {
        this.id_cat_articulo = id_cat_articulo;
    }

    public String getNombre_cat_articulo() {
        return nombre_cat_articulo;
    }

    public void setNombre_cat_articulo(String nombre_cat_articulo) {
        this.nombre_cat_articulo = nombre_cat_articulo;
    }

}
