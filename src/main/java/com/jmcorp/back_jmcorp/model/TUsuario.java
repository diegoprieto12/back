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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "usuario")
public class TUsuario implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqUsuario")
    @SequenceGenerator(name = "seqUsuario", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_USUARIO_ID")
    private Long id_usuario;
    private String nombre_usuario;
    private String pass_usuario;
    private String estado_usuario;
    private String acceso_usuario;
    private String token_usuario;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_persona")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private TPersona persona;

    @ManyToOne
    @JoinColumn(name = "id_t_usuario")
    private TTipoUsuario tipo_usuario;

    @OneToMany(mappedBy = "usuario")
    private List<TEmpresa> empresa;

    @OneToMany(mappedBy = "usuario")
    private List<TCajaChica> caja_Chica;

    @OneToMany(mappedBy = "usuario")
    private List<TLocal> local;

    @OneToMany(mappedBy = "usuario")
    private List<TBodega> bodega;

    @OneToMany(mappedBy = "usuario")
    private List<TEnvios> envios;

    @OneToMany(mappedBy = "usuario")
    private List<TArticulo> articulo;

    @OneToMany(mappedBy = "usuario")
    private List<TProducto> producto;

    @OneToMany(mappedBy = "usuario")
    private List<TOrdenCabecera> ordenCabecera;

    

    public TUsuario() {

    }

    public TUsuario(Long id_usuario, String nombre_usuario, String pass_usuario, String estado_usuario,
            String acceso_usuario, String token_usuario, TPersona persona, TTipoUsuario tipo_usuario,
            List<TProducto> producto) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.pass_usuario = pass_usuario;
        this.estado_usuario = estado_usuario;
        this.acceso_usuario = acceso_usuario;
        this.token_usuario = token_usuario;
        this.persona = persona;
        this.tipo_usuario = tipo_usuario;
        this.producto = producto;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getPass_usuario() {
        return pass_usuario;
    }

    public void setPass_usuario(String pass_usuario) {
        this.pass_usuario = pass_usuario;
    }

    public String getEstado_usuario() {
        return estado_usuario;
    }

    public void setEstado_usuario(String estado_usuario) {
        this.estado_usuario = estado_usuario;
    }

    public String getAcceso_usuario() {
        return acceso_usuario;
    }

    public void setAcceso_usuario(String acceso_usuario) {
        this.acceso_usuario = acceso_usuario;
    }

    public TPersona getPersona() {
        return persona;
    }

    public void setPersona(TPersona persona) {
        this.persona = persona;
    }

    public TTipoUsuario getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(TTipoUsuario tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public String getToken_usuario() {
        return token_usuario;
    }

    public void setToken_usuario(String token_usuario) {
        this.token_usuario = token_usuario;
    }

}
