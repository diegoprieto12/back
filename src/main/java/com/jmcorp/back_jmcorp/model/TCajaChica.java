package com.jmcorp.back_jmcorp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import javax.persistence.ManyToOne;

@Entity
@Table(name = "caja_chica")
public class TCajaChica {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqcajachica")
    @SequenceGenerator(name = "seqcajachica", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_cajachica_ID")
    private Long id_caja;
    // private String descripcion;
    // private int cantidad;
    // private double valor;
    private Object[] descripcion;
    private double ingreso;
    private double valor_ingreso2;
    private String descripcion_ingreso;
    private String numero_factura;
    private String proveedor;
    private Date fecha;
    // private String hora;
    private Double valor_final;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private TUsuario usuario;

    public TCajaChica() {
    }

    public TCajaChica(double ingreso, Date fecha, TUsuario usuario,
            Double valor_final, Object[] descripcion, double valor_ingreso2, String descripcion_ingreso,
            String numero_factura, String proveedor) {
        this.valor_ingreso2 = valor_ingreso2;
        this.descripcion_ingreso = descripcion_ingreso;
        this.numero_factura = numero_factura;
        this.proveedor = proveedor;
        this.descripcion = descripcion;
        this.valor_final = valor_final;
        this.ingreso = ingreso;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public double getValor_ingreso2() {
        return valor_ingreso2;
    }

    public void setValor_ingreso2(double valor_ingreso2) {
        this.valor_ingreso2 = valor_ingreso2;
    }

    public String getDescripcion_ingreso() {
        return descripcion_ingreso;
    }

    public void setDescripcion_ingreso(String descripcion_ingreso) {
        this.descripcion_ingreso = descripcion_ingreso;
    }

    public String getNumero_factura() {
        return numero_factura;
    }

    public void setNumero_factura(String numero_factura) {
        this.numero_factura = numero_factura;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public Double getValor_final() {
        return valor_final;
    }

    public void setValor_final(Double valor_final) {
        this.valor_final = valor_final;
    }

    public TUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(TUsuario usuario) {
        this.usuario = usuario;
    }

    public Long getId_caja() {
        return id_caja;
    }

    public void setId_caja(Long id_caja) {
        this.id_caja = id_caja;
    }

    public Object[] getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Object[] descripcion) {
        this.descripcion = descripcion;
    }

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
