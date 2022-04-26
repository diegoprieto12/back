package com.jmcorp.back_jmcorp.controller;

import java.io.File;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.websocket.Encoder.BinaryStream;

import com.jmcorp.back_jmcorp.model.TArticulo;
import com.jmcorp.back_jmcorp.model.TProducto;
import com.jmcorp.back_jmcorp.model.TEmpresa;

@Entity
@Table(name = "imagen")
public class Timagen {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqimagen")
    @SequenceGenerator(name = "seqimagen", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_imagen_ID")
    private Long id_imagen;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    // image bytes can have large lengths so we specify a value
    // which is more than the default length for picByte column
    @Column(name = "picByte", length = 1000)
    private byte[] picByte;

    @OneToMany(mappedBy = "imagen")
    private List<TProducto> imagen;

    @OneToMany(mappedBy = "imagen")
    private List<TArticulo> imagenArticulo;

    @OneToMany(mappedBy = "imagen")
    private List<TEmpresa> imagen_empresa;
    public Timagen(){

    }
    public Timagen(String name, String type, byte[] picByte) {
		this.name = name;
		this.type = type;
		this.picByte = picByte;
	}

    public Timagen(Long id_imagen) {
        this.id_imagen = id_imagen;
    }
    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String gettype() {
        return type;
    }

    public void settype(String type) {
        this.type = type;
    }

    public byte[] getpicByte() {
        return picByte;
    }

    public void setpicByte(byte[] picByte) {
        this.picByte = picByte;
    }

    public Long getId_imagen() {
        return id_imagen;
    }

    public void setId_imagen(Long id_imagen) {
        this.id_imagen = id_imagen;
    }
}