package com.jmcorp.back_jmcorp.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "bodega")
public class TBodega implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqBodega")
    @SequenceGenerator(name = "seqBodega", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_BODEGA_ID")
    private Long id_bodega;

    private String nombre_bodega;
    private String estado_bodega;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private TUsuario usuario;

    @JsonIgnore
    @OneToOne(mappedBy = "bodega")
    private TTaller taller;

    @OneToMany(mappedBy = "bodega")
    private List<TEnvios> envios;

    //@OneToMany(mappedBy = "bodega")
    //private List<TProductoBodega> producto_bodega;

    @OneToMany(mappedBy = "bodega")
    private List<TInventario> inventario;

    public TBodega() {
    }

    public TBodega(Long id_bodega, String nombre_bodega, String estado_bodega, TUsuario usuario) {
        this.id_bodega = id_bodega;
        this.nombre_bodega = nombre_bodega;
        this.estado_bodega = estado_bodega;
        this.usuario = usuario;
    }

    public Long getId_bodega() {
        return id_bodega;
    }

    public void setId_bodega(Long id_bodega) {
        this.id_bodega = id_bodega;
    }

    public String getNombre_bodega() {
        return nombre_bodega;
    }

    public void setNombre_bodega(String nombre_bodega) {
        this.nombre_bodega = nombre_bodega;
    }

    public String getEstado_bodega() {
        return estado_bodega;
    }

    public void setEstado_bodega(String estado_bodega) {
        this.estado_bodega = estado_bodega;
    }

    public TUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(TUsuario usuario) {
        this.usuario = usuario;
    }

}
