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
@Table(name = "categoria_producto")
public class TCategoriaProducto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqCategoriaProducto")
    @SequenceGenerator(name = "seqCategoriaProducto", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_CATEGORIAPRODUCTO_ID")
    private Long id_cat_producto;

    private String nombre_cat_producto;
    //private int porcentaje_ganancia;
    
    @OneToMany(mappedBy = "categoria_producto")
    private List<TProducto> producto;
    

    public TCategoriaProducto() {
    }
    
    public TCategoriaProducto(Long id_cat_producto, String nombre_cat_producto){
        this.id_cat_producto = id_cat_producto;
        this.nombre_cat_producto = nombre_cat_producto;
    }
    
    public Long getId_cat_producto() {
        return id_cat_producto;
    }

    public void setId_cat_producto(Long id_cat_producto) {
        this.id_cat_producto = id_cat_producto;
    }

    public String getNombre_cat_producto() {
        return nombre_cat_producto;
    }

    public void setNombre_cat_producto(String nombre_cat_producto) {
        this.nombre_cat_producto = nombre_cat_producto;
    }

}
