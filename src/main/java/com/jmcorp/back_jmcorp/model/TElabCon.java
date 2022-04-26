package com.jmcorp.back_jmcorp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "Elab_con")
public class TElabCon {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqElabcon")
    @SequenceGenerator(name = "seqElabcon", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_T_Elaborado_CON_ID")

    private Long id_elab_con;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private TProducto producto;

    @ManyToOne
    @JoinColumn(name = "id_articulo")
    private TArticulo articulo;

    private int cantidad;
    private int orden;

    public TElabCon() {
    }

    public TElabCon(Long id_elab_con, TProducto producto, TArticulo articulo, int cantidad, int orden) {
        this.orden = orden;
    
        this.id_elab_con = id_elab_con;
        this.articulo = articulo;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public Long getId_elab_con() {
        return id_elab_con;
    }

    public void setId_elab_con(Long id_elab_con) {
        this.id_elab_con = id_elab_con;
    }

    public TProducto getProducto() {
        return producto;
    }

    public void setProducto(TProducto producto) {
        this.producto = producto;
    }

    public TArticulo getArticulo() {
        return articulo;
    }

    public void setArticulo(TArticulo articulo) {
        this.articulo = articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
