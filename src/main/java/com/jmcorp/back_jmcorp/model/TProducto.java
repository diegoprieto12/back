package com.jmcorp.back_jmcorp.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jmcorp.back_jmcorp.controller.Timagen;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "producto")
public class TProducto implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqProducto")
    @SequenceGenerator(name = "seqProducto", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_PRODUCTO_ID")
    private Long id_producto;
    private String nombre_producto;
    // private Object[][] elaborado_con_producto;
    private String estado_producto;
    
    //@Column( length = 100000)
    //private String imagen_producto;
    //private Object[][] imagen_producto;
    private String codigo_barras_producto;
    private double precio_producto;
    private double precio_costo;
    private Long descuento_producto;
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "hh:mm")
    private Date tiempo_produccion_producto;
    private Long porcentaje_ganacia_producto;
    private String alto_producto;
    private String ancho_producto;
    private String profundidad_producto;
    private String contenido_producto;
    private String web_producto;
    private Number iva_producto;
    //private Number porcentaje_ganancia;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private TUsuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_cat_producto")
    private TCategoriaProducto categoria_producto;

    @ManyToOne
    @JoinColumn(name = "id_catalogo")
    private TCatalogoProducto catalogo_producto;

    @ManyToOne
    @JoinColumn(name = "id_imagen")
    private Timagen imagen;

    @JsonIgnore
    @OneToOne(mappedBy = "producto")
    private TProductoComprometido producto_comprometido;

    @OneToMany(mappedBy = "producto")
    private List<TElabCon> elabCon;

    @OneToMany(mappedBy = "producto")
    private List<TOrdenCuerpo> ordencuerpo;

    public TProducto() {
    }

    public TProducto(Long id_producto, String nombre_producto, String estado_producto, Timagen imagen,
            String codigo_barras_producto, double precio_producto, double precio_costo, Long descuento_producto,
            Date tiempo_produccion_producto, Long porcentaje_ganacia_producto, String alto_producto,
            String ancho_producto, String profundidad_producto, String contenido_producto, String web_producto,
            Number iva_producto, TUsuario usuario, TCategoriaProducto categoria_producto,
            TCatalogoProducto catalogo_producto, TProductoComprometido producto_comprometido, List<TElabCon> elabCon) {
                
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.estado_producto = estado_producto;
        this.imagen = imagen;
        this.codigo_barras_producto = codigo_barras_producto;
        this.precio_producto = precio_producto;
        this.precio_costo = precio_costo;
        this.descuento_producto = descuento_producto;
        this.tiempo_produccion_producto = tiempo_produccion_producto;
        this.porcentaje_ganacia_producto = porcentaje_ganacia_producto;
        this.alto_producto = alto_producto;
        this.ancho_producto = ancho_producto;
        this.profundidad_producto = profundidad_producto;
        this.contenido_producto = contenido_producto;
        this.web_producto = web_producto;
        this.iva_producto = iva_producto;
        this.usuario = usuario;
        this.categoria_producto = categoria_producto;
        this.catalogo_producto = catalogo_producto;
        this.producto_comprometido = producto_comprometido;
        this.elabCon = elabCon;
    }
   
    public double getPrecio_costo() {
        return precio_costo;
    }

    public void setPrecio_costo(double precio_costo) {
        this.precio_costo = precio_costo;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getEstado_producto() {
        return estado_producto;
    }

    public void setEstado_producto(String estado_producto) {
        this.estado_producto = estado_producto;
    }
    
    public String getCodigo_barras_producto() {
        return codigo_barras_producto;
    }

    public void setCodigo_barras_producto(String codigo_barras_producto) {
        this.codigo_barras_producto = codigo_barras_producto;
    }

    public double getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(double precio_producto) {
        this.precio_producto = precio_producto;
    }

    public Long getDescuento_producto() {
        return descuento_producto;
    }

    public void setDescuento_producto(Long descuento_producto) {
        this.descuento_producto = descuento_producto;
    }

    public Date getTiempo_produccion_producto() {
        return tiempo_produccion_producto;
    }

    public void setTiempo_produccion_producto(Date tiempo_produccion_producto) {
        this.tiempo_produccion_producto = tiempo_produccion_producto;
    }

    public Long getPorcentaje_ganacia_producto() {
        return porcentaje_ganacia_producto;
    }

    public void setPorcentaje_ganacia_producto(Long porcentaje_ganacia_producto) {
        this.porcentaje_ganacia_producto = porcentaje_ganacia_producto;
    }

    public String getAlto_producto() {
        return alto_producto;
    }

    public void setAlto_producto(String alto_producto) {
        this.alto_producto = alto_producto;
    }

    public String getAncho_producto() {
        return ancho_producto;
    }

    public void setAncho_producto(String ancho_producto) {
        this.ancho_producto = ancho_producto;
    }

    public String getProfundidad_producto() {
        return profundidad_producto;
    }

    public void setProfundidad_producto(String profundidad_producto) {
        this.profundidad_producto = profundidad_producto;
    }

    public String getContenido_producto() {
        return contenido_producto;
    }

    public void setContenido_producto(String contenido_producto) {
        this.contenido_producto = contenido_producto;
    }

    public String getWeb_producto() {
        return web_producto;
    }

    public void setWeb_producto(String web_producto) {
        this.web_producto = web_producto;
    }

    public Number getIva_producto() {
        return iva_producto;
    }

    public void setIva_producto(Number iva_producto) {
        this.iva_producto = iva_producto;
    }

    public TUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(TUsuario usuario) {
        this.usuario = usuario;
    }

    public TCategoriaProducto getCategoria_producto() {
        return categoria_producto;
    }

    public void setCategoria_producto(TCategoriaProducto categoria_producto) {
        this.categoria_producto = categoria_producto;
    }

    public TCatalogoProducto getCatalogo_producto() {
        return catalogo_producto;
    }

    public void setCatalogo_producto(TCatalogoProducto catalogo_producto) {
        this.catalogo_producto = catalogo_producto;
    }

    public Timagen getImagen() {
        return imagen;
    }

    public void setImagen(Timagen imagen) {
        this.imagen = imagen;
    }

}
