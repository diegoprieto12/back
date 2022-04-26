package com.jmcorp.back_jmcorp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "persona")
public class TPersona implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqPersona")
    @SequenceGenerator(name = "seqPersona", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_T_PERSONA_ID")
    private Long id_persona;

    private String cedula_persona;
    private String nombre_persona;
    private String apellido_persona;
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date fecha_naci_persona;
    private String telefono_persona;
    private String sexo_persona;
    private String correo_persona;
    private String direccion_persona;

    @JsonIgnore
    @OneToOne(mappedBy = "persona")
    private TUsuario usuario;

    @JsonIgnore
    @OneToOne(mappedBy = "persona")
    private TCliente cliente;

    @JsonIgnore
    @OneToOne(mappedBy = "persona")
    private TProveedor proveedor;

    public TPersona() {

    }

    public TPersona(Long id_persona, String cedula_persona, String nombre_persona, String apellido_persona,
            Date fecha_naci_persona, String telefono_persona, String sexo_persona, String correo_persona,
            String direccion_persona) {
        this.id_persona = id_persona;
        this.cedula_persona = cedula_persona;
        this.nombre_persona = nombre_persona;
        this.apellido_persona = apellido_persona;
        this.fecha_naci_persona = fecha_naci_persona;
        this.telefono_persona = telefono_persona;
        this.sexo_persona = sexo_persona;
        this.correo_persona = correo_persona;
        this.direccion_persona = direccion_persona;
    }

    public Long getId_persona() {
        return id_persona;
    }

    public void setId_persona(Long id_persona) {
        this.id_persona = id_persona;
    }

    public String getCedula_persona() {
        return cedula_persona;
    }

    public void setCedula_persona(String cedula_persona) {
        this.cedula_persona = cedula_persona;
    }

    public String getNombre_persona() {
        return nombre_persona;
    }

    public void setNombre_persona(String nombre_persona) {
        this.nombre_persona = nombre_persona;
    }

    public String getApellido_persona() {
        return apellido_persona;
    }

    public void setApellido_persona(String apellido_persona) {
        this.apellido_persona = apellido_persona;
    }

    public Date getFecha_naci_persona() {
        return fecha_naci_persona;
    }

    public void setFecha_naci_persona(Date fecha_naci_persona) {
        this.fecha_naci_persona = fecha_naci_persona;
    }

    public String getTelefono_persona() {
        return telefono_persona;
    }

    public void setTelefono_persona(String telefono_persona) {
        this.telefono_persona = telefono_persona;
    }

    public String getSexo_persona() {
        return sexo_persona;
    }

    public void setSexo_persona(String sexo_persona) {
        this.sexo_persona = sexo_persona;
    }

    public String getCorreo_persona() {
        return correo_persona;
    }

    public void setCorreo_persona(String correo_persona) {
        this.correo_persona = correo_persona;
    }

    public String getDireccion_persona() {
        return direccion_persona;
    }

    public void setDireccion_persona(String direccion_persona) {
        this.direccion_persona = direccion_persona;
    }

}
