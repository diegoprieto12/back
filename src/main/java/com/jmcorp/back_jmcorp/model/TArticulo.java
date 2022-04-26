package com.jmcorp.back_jmcorp.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.jmcorp.back_jmcorp.controller.Timagen;

@Entity
@Table(name = "articulo")
public class TArticulo implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqArticulo")
    @SequenceGenerator(name = "seqArticulo", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_ARTICULO_ID")
    private Long id_articulo;
    private String nombre_articulo;
    private String descripcion_articulo;
    private String color_articulo;
    private String sin_elaborar;
    private String estado_articulo;
    private String codigo_barras_articulo;
    private double precio_articulo;
    private Long descuento_articulo;
    private Long porcentaje_ganacia_articulo;
    private double precio_costo_articulo;
    private Long margen_produccion_articulo;
    private Double precio_produccion_articulo;
    private Long stock_minimo_articulo;
    private Long iva_articulo;
    private Object[] id_proveedor;
    private Double precio_final_articulo;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private TUsuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_cat_articulo")
    private TCategoriaArticulo categoria_articulo;

    @ManyToOne
    @JoinColumn(name = "id_medida")
    private TMedida medida;

    @OneToMany(mappedBy = "articulo")
    private List<TEnvios> envios;

    @OneToMany(mappedBy = "articulo")
    private List<TElabCon> elabCon;

    //@OneToMany(mappedBy = "articulo")
    //private List<TProductoBodega> productoBodega;

    @OneToMany(mappedBy = "articulos")
    private List<TInventario> inventario;

    //@OneToMany(mappedBy = "articulo")
    //private List<TcajaCuerpo> cajaCuerpo;
    
    @ManyToOne
    @JoinColumn(name = "id_imagen")
    private Timagen imagen;


    public TArticulo() {
    }

    public TArticulo(String nombre_articulo, String descripcion_articulo, String color_articulo, String sin_elaborar,
            String estado_articulo, String codigo_barras_articulo, double precio_articulo,
            Long descuento_articulo, Long porcentaje_ganacia_articulo, double precio_costo_articulo,
            Long margen_produccion_articulo, Double precio_produccion_articulo, Long stock_minimo_articulo,
            Long iva_articulo, Object[] id_proveedor, Double precio_final_articulo, TUsuario usuario,
            TCategoriaArticulo categoria_articulo, TMedida medida, List<TEnvios> envios, List<TElabCon> elabCon,
            List<TInventario> inventario,Timagen imagen ) {
        this.nombre_articulo = nombre_articulo;
        this.descripcion_articulo = descripcion_articulo;
        this.color_articulo = color_articulo;
        this.sin_elaborar = sin_elaborar;
        this.estado_articulo = estado_articulo;
        this.imagen= imagen;
        this.codigo_barras_articulo = codigo_barras_articulo;
        this.precio_articulo = precio_articulo;
        this.descuento_articulo = descuento_articulo;
        this.porcentaje_ganacia_articulo = porcentaje_ganacia_articulo;
        this.precio_costo_articulo = precio_costo_articulo;
        this.margen_produccion_articulo = margen_produccion_articulo;
        this.precio_produccion_articulo = precio_produccion_articulo;
        this.stock_minimo_articulo = stock_minimo_articulo;
        this.iva_articulo = iva_articulo;
        this.id_proveedor = id_proveedor;
        this.precio_final_articulo = precio_final_articulo;
        this.usuario = usuario;
        this.categoria_articulo = categoria_articulo;
        this.medida = medida;
        this.envios = envios;
        this.elabCon = elabCon;
        this.inventario = inventario;
    }



    public Timagen getImagen() {
        return imagen;
    }

    public void setImagen(Timagen imagen) {
        this.imagen = imagen;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(Long id_articulo) {
        this.id_articulo = id_articulo;
    }

    public String getNombre_articulo() {
        return nombre_articulo;
    }

    public void setNombre_articulo(String nombre_articulo) {
        this.nombre_articulo = nombre_articulo;
    }

    public String getDescripcion_articulo() {
        return descripcion_articulo;
    }

    public void setDescripcion_articulo(String descripcion_articulo) {
        this.descripcion_articulo = descripcion_articulo;
    }

    public String getColor_articulo() {
        return color_articulo;
    }

    public void setColor_articulo(String color_articulo) {
        this.color_articulo = color_articulo;
    }

    public String getSin_elaborar() {
        return sin_elaborar;
    }

    public void setSin_elaborar(String sin_elaborar) {
        this.sin_elaborar = sin_elaborar;
    }

    public String getEstado_articulo() {
        return estado_articulo;
    }

    public void setEstado_articulo(String estado_articulo) {
        this.estado_articulo = estado_articulo;
    }

    public String getCodigo_barras_articulo() {
        return codigo_barras_articulo;
    }

    public void setCodigo_barras_articulo(String codigo_barras_articulo) {
        this.codigo_barras_articulo = codigo_barras_articulo;
    }

    public double getPrecio_articulo() {
        return precio_articulo;
    }

    public void setPrecio_articulo(double precio_articulo) {
        this.precio_articulo = precio_articulo;
    }

    public Long getDescuento_articulo() {
        return descuento_articulo;
    }

    public void setDescuento_articulo(Long descuento_articulo) {
        this.descuento_articulo = descuento_articulo;
    }

    public Long getPorcentaje_ganacia_articulo() {
        return porcentaje_ganacia_articulo;
    }

    public void setPorcentaje_ganacia_articulo(Long porcentaje_ganacia_articulo) {
        this.porcentaje_ganacia_articulo = porcentaje_ganacia_articulo;
    }

    public double getPrecio_costo_articulo() {
        return precio_costo_articulo;
    }

    public void setPrecio_costo_articulo(double precio_costo_articulo) {
        this.precio_costo_articulo = precio_costo_articulo;
    }

    public Long getMargen_produccion_articulo() {
        return margen_produccion_articulo;
    }

    public void setMargen_produccion_articulo(Long margen_produccion_articulo) {
        this.margen_produccion_articulo = margen_produccion_articulo;
    }

    public Double getPrecio_produccion_articulo() {
        return precio_produccion_articulo;
    }

    public void setPrecio_produccion_articulo(Double precio_produccion_articulo) {
        this.precio_produccion_articulo = precio_produccion_articulo;
    }

    public Long getStock_minimo_articulo() {
        return stock_minimo_articulo;
    }

    public void setStock_minimo_articulo(Long stock_minimo_articulo) {
        this.stock_minimo_articulo = stock_minimo_articulo;
    }

    public Long getIva_articulo() {
        return iva_articulo;
    }

    public void setIva_articulo(Long iva_articulo) {
        this.iva_articulo = iva_articulo;
    }

    public Object[] getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(Object[] id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public Double getPrecio_final_articulo() {
        return precio_final_articulo;
    }

    public void setPrecio_final_articulo(Double precio_final_articulo) {
        this.precio_final_articulo = precio_final_articulo;
    }

    public TUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(TUsuario usuario) {
        this.usuario = usuario;
    }

    public TCategoriaArticulo getCategoria_articulo() {
        return categoria_articulo;
    }

    public void setCategoria_articulo(TCategoriaArticulo categoria_articulo) {
        this.categoria_articulo = categoria_articulo;
    }

    public TMedida getMedida() {
        return medida;
    }

    public void setMedida(TMedida medida) {
        this.medida = medida;
    }

}
