package com.jmcorp.back_jmcorp.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "articulo_bodega")
public class TProductoBodega implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqarticuloBodega")
    @SequenceGenerator(name = "seqarticuloBodega", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_articuloBODEGA_ID")
    private Long id_articulo_bodega;

    private Date fecha;
    private double subtotal;
    private int iva;
    private double valor_total;
    private String codigo_fact;
    private String Tipo_ArtBodega;

    @ManyToOne
    @JoinColumn(name = "id_proveedor")
    private TProveedor proveedor;

    
    @OneToMany(mappedBy = "productobodega")
    private List<TInventario> inventario;

    public TProductoBodega() {
    }
   
    public TProductoBodega(Date fecha, double subtotal, int iva, double valor_total, String codigo_fact,
            String tipo_ArtBodega, TProveedor proveedor) {
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.iva = iva;
        this.valor_total = valor_total;
        this.codigo_fact = codigo_fact;
        Tipo_ArtBodega = tipo_ArtBodega;
        this.proveedor = proveedor;
    }

    public String getCodigo_fact() {
        return codigo_fact;
    }
    
    public void setCodigo_fact(String codigo_fact) {
        this.codigo_fact = codigo_fact;
    }

    public String getTipo_ArtBodega() {
        return Tipo_ArtBodega;
    }

    public void setTipo_ArtBodega(String tipo_ArtBodega) {
        Tipo_ArtBodega = tipo_ArtBodega;
    }

    public TProveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(TProveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Long getId_articulo_bodega() {
        return id_articulo_bodega;
    }

    public void setId_articulo_bodega(Long id_articulo_bodega) {
        this.id_articulo_bodega = id_articulo_bodega;
    }

    /*
     * public Long getStock_articulo_bodega() {
     * return stock_articulo_bodega;
     * }
     * 
     * public void setStock_articulo_bodega(Long stock_articulo_bodega) {
     * this.stock_articulo_bodega = stock_articulo_bodega;
     * }
     */
    /*
     * public Long getStock_deteriorado_articulo_bodega() {
     * return stock_deteriorado_articulo_bodega;
     * }
     * 
     * public void setStock_deteriorado_articulo_bodega(Long
     * stock_deteriorado_articulo_bodega) {
     * this.stock_deteriorado_articulo_bodega = stock_deteriorado_articulo_bodega;
     * }
     * 
     * 
     * public TBodega getBodega() {
     * return bodega;
     * }
     * 
     * public void setBodega(TBodega bodega) {
     * this.bodega = bodega;
     * }
     */

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

}
