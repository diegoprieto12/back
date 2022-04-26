package com.jmcorp.back_jmcorp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_pedido")
public class TDetallePedido implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqDetallePedido")
    @SequenceGenerator(name = "seqDetallePedido", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_DETALLEPEDIDO_ID")
    private Long id_detalle_pedido;
    private String id_producto_detalle_pedido;
    private String id_articulo_detalle_pedido;
    private Long cantidad_detalle_pedido;

    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private TPedido pedido;

    public TDetallePedido() {
    }

    public TDetallePedido(Long id_detalle_pedido, String id_producto_detalle_pedido, String id_articulo_detalle_pedido,
            Long cantidad_detalle_pedido, TPedido pedido) {
        this.id_detalle_pedido = id_detalle_pedido;
        this.id_producto_detalle_pedido = id_producto_detalle_pedido;
        this.id_articulo_detalle_pedido = id_articulo_detalle_pedido;
        this.cantidad_detalle_pedido = cantidad_detalle_pedido;
        this.pedido = pedido;
    }

    public Long getId_detalle_pedido() {
        return id_detalle_pedido;
    }

    public void setId_detalle_pedido(Long id_detalle_pedido) {
        this.id_detalle_pedido = id_detalle_pedido;
    }

    public String getId_producto_detalle_pedido() {
        return id_producto_detalle_pedido;
    }

    public void setId_producto_detalle_pedido(String id_producto_detalle_pedido) {
        this.id_producto_detalle_pedido = id_producto_detalle_pedido;
    }

    public String getId_articulo_detalle_pedido() {
        return id_articulo_detalle_pedido;
    }

    public void setId_articulo_detalle_pedido(String id_articulo_detalle_pedido) {
        this.id_articulo_detalle_pedido = id_articulo_detalle_pedido;
    }

    public Long getCantidad_detalle_pedido() {
        return cantidad_detalle_pedido;
    }

    public void setCantidad_detalle_pedido(Long cantidad_detalle_pedido) {
        this.cantidad_detalle_pedido = cantidad_detalle_pedido;
    }

    public TPedido getPedido() {
        return pedido;
    }

    public void setPedido(TPedido pedido) {
        this.pedido = pedido;
    }

}
