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
@Table(name = "medida")
public class TMedida implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqMedida")
    @SequenceGenerator(name = "seqMedida", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_MEDIDA_ID")
    private Long id_medida;

    private String nombre_medida;

    @OneToMany(mappedBy = "medida")
    private List<TArticulo> articulo;

    public TMedida() {
    }

    public TMedida(Long id_medida, String nombre_medida) {
        this.id_medida = id_medida;
        this.nombre_medida = nombre_medida;
    }

    public Long getId_medida() {
        return id_medida;
    }

    public void setId_medida(Long id_medida) {
        this.id_medida = id_medida;
    }

    public String getNombre_medida() {
        return nombre_medida;
    }

    public void setNombre_medida(String nombre_medida) {
        this.nombre_medida = nombre_medida;
    }

}
