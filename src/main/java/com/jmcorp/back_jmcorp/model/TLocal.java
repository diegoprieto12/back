package com.jmcorp.back_jmcorp.model;

import java.io.Serializable;
import java.util.List;

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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "local")
public class TLocal implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqLocal")
    @SequenceGenerator(name = "seqLocal", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_LOCAL_ID")
    private Long id_local;

    private String nombre_local;
    private String estado_local;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private TUsuario usuario;

    @JsonIgnore
    @OneToOne(mappedBy = "local")
    private TTaller taller;

    @OneToMany(mappedBy = "local")
    private List<TProductoComprometido> producto_comprometido;

    @JsonIgnore
    @OneToOne(mappedBy = "local")
    private TPedido pedido;

    public TLocal() {
    }

    public TLocal(Long id_local, String nombre_local, String estado_local, TUsuario usuario) {
        this.id_local = id_local;
        this.nombre_local = nombre_local;
        this.estado_local = estado_local;
        this.usuario = usuario;
    }

    public Long getId_local() {
        return id_local;
    }

    public void setId_local(Long id_local) {
        this.id_local = id_local;
    }

    public String getNombre_local() {
        return nombre_local;
    }

    public void setNombre_local(String nombre_local) {
        this.nombre_local = nombre_local;
    }

    public String getEstado_local() {
        return estado_local;
    }

    public void setEstado_local(String estado_local) {
        this.estado_local = estado_local;
    }

    public TUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(TUsuario usuario) {
        this.usuario = usuario;
    }

}
