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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.jmcorp.back_jmcorp.controller.Timagen;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "empresa")
public class TEmpresa implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqEmpresa")
    @SequenceGenerator(name = "seqEmpresa", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_EMPRESA_ID")
    private Long id_empresa;

    private String nombre_empresa;
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date fecha_fundacion_empresa;
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date fecha_creacion_empresa;
    private String estado_empresa;
    private String agencia;
    private String direccion_matriz;
    private String direccion_sucursal;
    private String celular_empresa;
    private String email_empresa;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private TUsuario usuario;

    @OneToMany(mappedBy = "empresa")
    private List<TOrdenCabecera> orden_cabecera;

    @OneToMany(mappedBy = "empresa")
    private List<TOrdenProv> orden_prov;

    @ManyToOne
    @JoinColumn(name = "id_imagen")
    private Timagen imagen;

    public TEmpresa() {
    }

    public TEmpresa(Long id_empresa, String nombre_empresa, Date fecha_fundacion_empresa, Date fecha_creacion_empresa,
            String estado_empresa, String agencia, TUsuario usuario, String direccion_matriz, String direccion_sucursal,
            String celular_empresa, String email_empresa,
            Timagen imagen) {
        this.imagen= imagen;                
        this.direccion_matriz = direccion_matriz;
        this.direccion_sucursal = direccion_sucursal;
        this.celular_empresa = celular_empresa;
        this.email_empresa = email_empresa;
        this.id_empresa = id_empresa;
        this.nombre_empresa = nombre_empresa;
        this.fecha_fundacion_empresa = fecha_fundacion_empresa;
        this.fecha_creacion_empresa = fecha_creacion_empresa;
        this.estado_empresa = estado_empresa;
        this.agencia = agencia;
        this.usuario = usuario;
    }

    public Timagen getImagen() {
        return imagen;
    }

    public void setImagen(Timagen imagen) {
        this.imagen = imagen;
    }

    public String getDireccion_matriz() {
        return direccion_matriz;
    }

    public void setDireccion_matriz(String direccion_matriz) {
        this.direccion_matriz = direccion_matriz;
    }

    public String getDireccion_sucursal() {
        return direccion_sucursal;
    }

    public void setDireccion_sucursal(String direccion_sucursal) {
        this.direccion_sucursal = direccion_sucursal;
    }

    public String getCelular_empresa() {
        return celular_empresa;
    }

    public void setCelular_empresa(String celular_empresa) {
        this.celular_empresa = celular_empresa;
    }

    public String getEmail_empresa() {
        return email_empresa;
    }

    public void setEmail_empresa(String email_empresa) {
        this.email_empresa = email_empresa;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Long getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(Long id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public Date getFecha_fundacion_empresa() {
        return fecha_fundacion_empresa;
    }

    public void setFecha_fundacion_empresa(Date fecha_fundacion_empresa) {
        this.fecha_fundacion_empresa = fecha_fundacion_empresa;
    }

    public Date getFecha_creacion_empresa() {
        return fecha_creacion_empresa;
    }

    public void setFecha_creacion_empresa(Date fecha_creacion_empresa) {
        this.fecha_creacion_empresa = fecha_creacion_empresa;
    }

    public String getEstado_empresa() {
        return estado_empresa;
    }

    public void setEstado_empresa(String estado_empresa) {
        this.estado_empresa = estado_empresa;
    }

    public TUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(TUsuario usuario) {
        this.usuario = usuario;
    }

}
