package com.jmcorp.back_jmcorp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "orden_cabecera")
public class TOrdenCabecera implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqPersona")
    @SequenceGenerator(name = "seqOrdenCabecera", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_T_ORDEN_CABECERA_ID")

    private Long id_orden_cabecera;

    private Date fecha;
    // private String direccionmatriz;
    // private String direccionsucursal;
    // private String telefono;
    // private String email;
    private Date fechaentrega;
    private Date fechainicio;
    private Date fechafin;
    private String observacion;
    private String secuencia;

    @ManyToOne
    @JoinColumn(name = "id_local")
    private TLocal local;

    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private TEmpresa empresa;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private TCliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_destinatario")
    private TDestinatario destinatario;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private TUsuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_orden_cuerpo")
    private TOrdenCuerpo ordencuerpo;

    public TOrdenCabecera() {
    }

    public TOrdenCabecera(Date fecha, Date fechaentrega, Date fechainicio, Date fechafin,
            String observacion, String secuencia, TEmpresa empresa, TCliente cliente, TUsuario usuario,
            TDestinatario destinatario, TLocal local) {
        this.local= local;
        this.fecha = fecha;
        this.fechaentrega = fechaentrega;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.observacion = observacion;
        this.secuencia = secuencia;
        this.empresa = empresa;
        this.cliente = cliente;
        this.usuario = usuario;
        this.destinatario = destinatario;
    }

    public TLocal getLocal() {
        return local;
    }

    public void setLocal(TLocal local) {
        this.local = local;
    }

    public String getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(String secuencia) {
        this.secuencia = secuencia;
    }

    public Long getId_orden_cabecera() {
        return id_orden_cabecera;
    }

    public void setId_orden_cabecera(Long id_orden_cabecera) {
        this.id_orden_cabecera = id_orden_cabecera;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(Date fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public TEmpresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(TEmpresa empresa) {
        this.empresa = empresa;
    }

    public TCliente getCliente() {
        return cliente;
    }

    public void setCliente(TCliente cliente) {
        this.cliente = cliente;
    }

    public TUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(TUsuario usuario) {
        this.usuario = usuario;
    }

    public TOrdenCuerpo getOrdencuerpo() {
        return ordencuerpo;
    }

    public void setOrdencuerpo(TOrdenCuerpo ordencuerpo) {
        this.ordencuerpo = ordencuerpo;
    }

    public TDestinatario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(TDestinatario destinatario) {
        this.destinatario = destinatario;
    }

}