package com.jmcorp.back_jmcorp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "producto_comprometido")
public class TProductoComprometido implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqProductoComprom")
    @SequenceGenerator(name = "seqProductoComprom", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_PRODUCTOCOMPROMETIDO_ID")
    private Long id_producto_comprometido;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_producto")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private TProducto producto;

    @ManyToOne
    @JoinColumn(name = "id_local")
    private TLocal local;

    public TProductoComprometido() {
    }

    public TProductoComprometido(Long id_producto_comprometido, TProducto producto, TLocal local) {
        this.id_producto_comprometido = id_producto_comprometido;
        this.producto = producto;
        this.local = local;
    }

    public Long getId_producto_comprometido() {
        return id_producto_comprometido;
    }

    public void setId_producto_comprometido(Long id_producto_comprometido) {
        this.id_producto_comprometido = id_producto_comprometido;
    }

    public TProducto getProducto() {
        return producto;
    }

    public void setProducto(TProducto producto) {
        this.producto = producto;
    }

    public TLocal getLocal() {
        return local;
    }

    public void setLocal(TLocal local) {
        this.local = local;
    }

}
