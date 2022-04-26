package com.jmcorp.back_jmcorp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "envios")
public class TEnvios implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqEnvios")
    @SequenceGenerator(name = "seqEnvios", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_ENVIOS_ID")
    private Long id_envios;

    private Long stock_envios;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_ingreso_envios;
    private Long id_bodega_envio;
    private String numero_factura;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private TUsuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_articulo")
    private TArticulo articulo;

    @ManyToOne
    @JoinColumn(name = "id_bodega")
    private TBodega bodega;

    public TEnvios() {
    }

    public TEnvios(Long id_envios, Long stock_envios, Date fecha_ingreso_envios, Long id_bodega_envio,
            String numero_factura, TUsuario usuario, TArticulo articulo, TBodega bodega) {
        this.id_envios = id_envios;
        this.stock_envios = stock_envios;
        this.fecha_ingreso_envios = fecha_ingreso_envios;
        this.id_bodega_envio = id_bodega_envio;
        this.numero_factura = numero_factura;
        this.usuario = usuario;
        this.articulo = articulo;
        this.bodega = bodega;
    }

    public Long getId_envios() {
        return id_envios;
    }

    public void setId_envios(Long id_envios) {
        this.id_envios = id_envios;
    }

    public Long getStock_envios() {
        return stock_envios;
    }

    public void setStock_envios(Long stock_envios) {
        this.stock_envios = stock_envios;
    }

    public Date getFecha_ingreso_envios() {
        return fecha_ingreso_envios;
    }

    public void setFecha_ingreso_envios(Date fecha_ingreso_envios) {
        this.fecha_ingreso_envios = fecha_ingreso_envios;
    }

    public Long getId_bodega_envio() {
        return id_bodega_envio;
    }

    public void setId_bodega_envio(Long id_bodega_envio) {
        this.id_bodega_envio = id_bodega_envio;
    }

    public TUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(TUsuario usuario) {
        this.usuario = usuario;
    }

    public TArticulo getArticulo() {
        return articulo;
    }

    public void setArticulo(TArticulo articulo) {
        this.articulo = articulo;
    }

    public TBodega getBodega() {
        return bodega;
    }

    public void setBodega(TBodega bodega) {
        this.bodega = bodega;
    }

    public String getNumero_factura() {
        return numero_factura;
    }

    public void setNumero_factura(String numero_factura) {
        this.numero_factura = numero_factura;
    }

}
