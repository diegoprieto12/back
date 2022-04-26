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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "catalogo_producto")
public class TCatalogoProducto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqCatalogoProducto")
    @SequenceGenerator(name = "seqCatalogoArticulo", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_CATALOGOARTICULO_ID")
    private Long id_catalogo;

    private String nombre_catalogo;
    private String estado_catalogo;

    @JsonIgnore
    @OneToMany(mappedBy = "catalogo_producto")
    private List<TProducto> producto;

    public TCatalogoProducto() {
    }

    public TCatalogoProducto(Long id_catalogo, String nombre_catalogo, String estado_catalogo) {
        this.id_catalogo = id_catalogo;
        this.nombre_catalogo = nombre_catalogo;
        this.estado_catalogo = estado_catalogo;
    }

    public Long getId_catalogo() {
        return id_catalogo;
    }

    public void setId_catalogo(Long id_catalogo) {
        this.id_catalogo = id_catalogo;
    }

    public String getNombre_catalogo() {
        return nombre_catalogo;
    }

    public void setNombre_catalogo(String nombre_catalogo) {
        this.nombre_catalogo = nombre_catalogo;
    }

    public String getEstado_catalogo() {
        return estado_catalogo;
    }

    public void setEstado_catalogo(String estado_catalogo) {
        this.estado_catalogo = estado_catalogo;
    }

}
