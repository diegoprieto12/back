package com.jmcorp.back_jmcorp.model;

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
@Table(name = "inventario")
public class TInventario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqInventario")
    @SequenceGenerator(name = "seqInventario", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_Inventario_ID")
    private Long id_inventario;
    
    private Long stock_articulo_bodega;
    private Long stock_deteriorado_articulo_bodega;
    
    @ManyToOne
    @JoinColumn(name = "id_bodega")
    private TBodega bodega;
    
    @ManyToOne
    @JoinColumn(name = "id_articulo")
    private TArticulo articulos;

    @ManyToOne
    @JoinColumn(name = "id_articulo_bodega")
    private TProductoBodega productobodega;


    
    public TInventario() {
    }
    public TInventario( Long stock_articulo_bodega, Long stock_deteriorado_articulo_bodega,
            TBodega bodega, TArticulo articulos) {
        this.stock_articulo_bodega = stock_articulo_bodega;
        this.stock_deteriorado_articulo_bodega = stock_deteriorado_articulo_bodega;
        this.bodega = bodega;
        this.articulos = articulos;
    }

    
    public TProductoBodega getProductobodega() {
        return productobodega;
    }
    public void setProductobodega(TProductoBodega productobodega) {
        this.productobodega = productobodega;
    }
    public Long getId_inventario() {
        return id_inventario;
    }


    public void setId_inventario(Long id_inventario) {
        this.id_inventario = id_inventario;
    }


    public Long getStock_articulo_bodega() {
        return stock_articulo_bodega;
    }

    public void setStock_articulo_bodega(Long stock_articulo_bodega) {
        this.stock_articulo_bodega = stock_articulo_bodega;
    }

    public Long getStock_deteriorado_articulo_bodega() {
        return stock_deteriorado_articulo_bodega;
    }

    public void setStock_deteriorado_articulo_bodega(Long stock_deteriorado_articulo_bodega) {
        this.stock_deteriorado_articulo_bodega = stock_deteriorado_articulo_bodega;
    }

    public TBodega getBodega() {
        return bodega;
    }

    public void setBodega(TBodega bodega) {
        this.bodega = bodega;
    }

    public TArticulo getArticulos() {
        return articulos;
    }

    public void setArticulos(TArticulo articulos) {
        this.articulos = articulos;
    }   
    
    

}
