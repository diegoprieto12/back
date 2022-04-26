package com.jmcorp.back_jmcorp.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "pedido")
public class TPedido implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqPedido")
    @SequenceGenerator(name = "seqPedido", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_PEDIDO_ID")
    private Long id_pedido;
    private String estado_pedido;
    private String notas_pedido;
    private String domicilio_pedido;
    private double abono_pedido;
    private String tipo_factura_pedido;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private TCliente cliente;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_local")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private TLocal local;

    //@JsonIgnore
    //@OneToOne(mappedBy = "pedido")
    //private TDestinatario destinatario;

    @OneToMany(mappedBy = "pedido")
    private List<TDetallePedido> detalle_pedido;

    public TPedido() {
    }

    public TPedido(Long id_pedido, String estado_pedido, String notas_pedido, String domicilio_pedido,
            double abono_pedido, String tipo_factura_pedido, TCliente cliente, TLocal local) {
        this.id_pedido = id_pedido;
        this.estado_pedido = estado_pedido;
        this.notas_pedido = notas_pedido;
        this.domicilio_pedido = domicilio_pedido;
        this.abono_pedido = abono_pedido;
        this.tipo_factura_pedido = tipo_factura_pedido;
        this.cliente = cliente;
        this.local = local;
    }

    public Long getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(Long id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getEstado_pedido() {
        return estado_pedido;
    }

    public void setEstado_pedido(String estado_pedido) {
        this.estado_pedido = estado_pedido;
    }

    public String getNotas_pedido() {
        return notas_pedido;
    }

    public void setNotas_pedido(String notas_pedido) {
        this.notas_pedido = notas_pedido;
    }

    public String getDomicilio_pedido() {
        return domicilio_pedido;
    }

    public void setDomicilio_pedido(String domicilio_pedido) {
        this.domicilio_pedido = domicilio_pedido;
    }

    public double getAbono_pedido() {
        return abono_pedido;
    }

    public void setAbono_pedido(double abono_pedido) {
        this.abono_pedido = abono_pedido;
    }

    public String getTipo_factura_pedido() {
        return tipo_factura_pedido;
    }

    public void setTipo_factura_pedido(String tipo_factura_pedido) {
        this.tipo_factura_pedido = tipo_factura_pedido;
    }

    public TCliente getCliente() {
        return cliente;
    }

    public void setCliente(TCliente cliente) {
        this.cliente = cliente;
    }

    public TLocal getLocal() {
        return local;
    }

    public void setLocal(TLocal local) {
        this.local = local;
    }

}
