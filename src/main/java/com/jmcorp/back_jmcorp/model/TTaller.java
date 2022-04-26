package com.jmcorp.back_jmcorp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "taller")
public class TTaller implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqTaller")
    @SequenceGenerator(name = "seqTaller", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_TALLER_ID")
    private Long id_taller;
    private String nombre_taller;
    private String estado_taller;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_local")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private TLocal local;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_bodega")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private TBodega bodega;

    public TTaller() {
    }

    public TTaller(Long id_taller, String nombre_taller, String estado_taller, TLocal local, TBodega bodega) {
        this.id_taller = id_taller;
        this.nombre_taller = nombre_taller;
        this.estado_taller = estado_taller;
        this.local = local;
        this.bodega = bodega;
    }

    public Long getId_taller() {
        return id_taller;
    }

    public void setId_taller(Long id_taller) {
        this.id_taller = id_taller;
    }

    public String getNombre_taller() {
        return nombre_taller;
    }

    public void setNombre_taller(String nombre_taller) {
        this.nombre_taller = nombre_taller;
    }

    public String getEstado_taller() {
        return estado_taller;
    }

    public void setEstado_taller(String estado_taller) {
        this.estado_taller = estado_taller;
    }

    public TLocal getLocal() {
        return local;
    }

    public void setLocal(TLocal local) {
        this.local = local;
    }

    public TBodega getBodega() {
        return bodega;
    }

    public void setBodega(TBodega bodega) {
        this.bodega = bodega;
    }

}
