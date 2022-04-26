package com.jmcorp.back_jmcorp.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_usuario")
public class TTipoUsuario implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqTipoPersona")
    @SequenceGenerator(name = "seqTipoPersona", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_TIPO_PERSONA_ID")
    private Long id_t_usuario;
    private String nombre_t_usuario;

    @OneToMany(mappedBy = "tipo_usuario")
    private List<TUsuario> usuario;

    public TTipoUsuario() {
    }

    public TTipoUsuario(Long id_t_usuario, String nombre_t_usuario) {
        this.id_t_usuario = id_t_usuario;
        this.nombre_t_usuario = nombre_t_usuario;
    }

    public Long getId_t_usuario() {
        return id_t_usuario;
    }

    public void setId_t_usuario(Long id_t_usuario) {
        this.id_t_usuario = id_t_usuario;
    }

    public String getNombre_t_usuario() {
        return nombre_t_usuario;
    }

    public void setNombre_t_usuario(String nombre_t_usuario) {
        this.nombre_t_usuario = nombre_t_usuario;
    }

}
