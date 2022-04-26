package com.jmcorp.back_jmcorp.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "cliente")
public class TCliente implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqCliente")
    @SequenceGenerator(name = "seqCliente", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_CLIENTE_ID")
    private Long id_cliente;

    private String nombre_tipo_cliente;
    private String estado_cliente;
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date fecha_creacion_cliente;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_persona")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private TPersona persona;

    @OneToMany(mappedBy = "cliente")
    private List<TPedido> pedido;

    @OneToMany(mappedBy = "cliente")
    private List<TOrdenCabecera> ordenCabecera;


    public TCliente() {

    }

    public TCliente(Long id_cliente, String nombre_tipo_cliente, String estado_cliente, Date fecha_creacion_cliente,
            TPersona persona) {
        this.id_cliente = id_cliente;
        this.nombre_tipo_cliente = nombre_tipo_cliente;
        this.estado_cliente = estado_cliente;
        this.fecha_creacion_cliente = fecha_creacion_cliente;
        this.persona = persona;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre_tipo_cliente() {
        return nombre_tipo_cliente;
    }

    public void setNombre_tipo_cliente(String nombre_tipo_cliente) {
        this.nombre_tipo_cliente = nombre_tipo_cliente;
    }

    public String getEstado_cliente() {
        return estado_cliente;
    }

    public void setEstado_cliente(String estado_cliente) {
        this.estado_cliente = estado_cliente;
    }

    public Date getFecha_creacion_cliente() {
        return fecha_creacion_cliente;
    }

    public void setFecha_creacion_cliente(Date fecha_creacion_cliente) {
        this.fecha_creacion_cliente = fecha_creacion_cliente;
    }

    public TPersona getPersona() {
        return persona;
    }

    public void setPersona(TPersona persona) {
        this.persona = persona;
    }

}
