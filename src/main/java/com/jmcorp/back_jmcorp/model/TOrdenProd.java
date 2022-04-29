package com.jmcorp.back_jmcorp.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "orden_produccion")
public class TOrdenProd {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqOrden")
    @SequenceGenerator(name = "seqOrden", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_CLIENTE_ID")
    private Long id_orden_prod;
    private String secuencia;
    private Object[][] producto;
    private Date fecha_pedido;
    private Date fecha_entrega;
    private String hora;
    private String observacion;
    private String autorizacion;
    private String imagen;
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private TUsuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private TEmpresa empresa;

    public TOrdenProd() {
    }


    public TOrdenProd(Long id_orden_prod, Object[][] producto, 
    Date fecha_pedido, Date fecha_entrega, String hora,
    String observacion, String secuencia, TEmpresa empresa,String autorizacion) {
        this.autorizacion = autorizacion;
        this.empresa= empresa;
        this.observacion = observacion;
        this.secuencia= secuencia;
        this.id_orden_prod = id_orden_prod;
        this.producto = producto;
        this.fecha_pedido = fecha_pedido;
        this.fecha_entrega = fecha_entrega;
        this.hora = hora;
    }

    public String getAutorizacion() {
        return autorizacion;
    }


    public void setAutorizacion(String autorizacion) {
        this.autorizacion = autorizacion;
    }


    public TEmpresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(TEmpresa empresa) {
        this.empresa = empresa;
    }

    public String getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(String secuencia) {
        this.secuencia = secuencia;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Object[][] getProducto() {
        return producto;
    }

    public void setProducto(Object[][] producto) {
        this.producto = producto;
    }

    public Date getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(Date fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public TUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(TUsuario usuario) {
        this.usuario = usuario;
    } 
    public Long getId_orden_prod() {
        return id_orden_prod;
    }

    public void setId_orden_prod(Long id_orden_prod) {
        this.id_orden_prod = id_orden_prod;
    }
 
}
