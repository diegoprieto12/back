package com.jmcorp.back_jmcorp.model;

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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "proveedor")
public class TProveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqProveedor")
    @SequenceGenerator(name = "seqProveedor", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_PROVEEDOR_ID")
    private Long id_proveedor;
    private String nombre_empresa_proveedor;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_persona")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private TPersona persona;

    

    @OneToMany(mappedBy = "proveedor")
    private List<TProductoBodega> productobodega;

    @OneToMany(mappedBy = "proveedor")
    private List<TOrdenProv> ordenprov;

    public TProveedor() {

    }

    public TProveedor(Long id_proveedor, String nombre_empresa_proveedor, TPersona persona) {
        this.id_proveedor = id_proveedor;
        this.nombre_empresa_proveedor = nombre_empresa_proveedor;
        this.persona = persona;
    }

    public Long getId_proveedor() {
        return this.id_proveedor;
    }

    public void setId_proveedor(Long id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public TPersona getPersona() {
        return this.persona;
    }

    public void setPersona(TPersona persona) {
        this.persona = persona;
    }

    public String getNombre_empresa_proveedor() {
        return nombre_empresa_proveedor;
    }

    public void setNombre_empresa_proveedor(String nombre_empresa_proveedor) {
        this.nombre_empresa_proveedor = nombre_empresa_proveedor;
    }

}
