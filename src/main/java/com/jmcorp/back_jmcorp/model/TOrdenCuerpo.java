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
@Table(name = "orden_cuerpo")
public class TOrdenCuerpo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqPersona")
    @SequenceGenerator(name = "seqOrdenCuerpo", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_T_ORDEN_CUERPO_ID")

    private Long id_orden_cuerpo;

    private String Descripcion;
    private String Transporte;
    private double costo_transporte;
    private double subtotal_12;
    private double subtotal_iva;
    private double subtotal;
    private double iva_12;
    private int iva;
    private double valor_total;
    private String forma_de_pago;
    private String banco;
    private double Anticipo;
    private double Saldo;
    private String hora;
    private String tipo_transporte;
    private String num_tarjeta;
    private String num_cheque;
    private String local_retiro;
    private Object[][] imagen_destinatario;
    // @ManyToOne
    // @JoinColumn(name = "id_producto")
    // private TProducto producto;
    private Object[][] producto;

    @OneToMany(mappedBy = "ordencuerpo")
    private List<TOrdenCabecera> ordencabecera;

    public TOrdenCuerpo() {
    }

    public TOrdenCuerpo(String descripcion, String transporte, String banco, double subtotal_12, double subtotal_iva,
            double subtotal,
            int iva, double valor_total, String forma_de_pago, double anticipo, double saldo, double costo_transporte,
            String hora,
            Object[][] producto, double iva_12, String tipo_transporte,
            String num_tarjeta, String num_cheque, String local_retiro, Object[][] imagen_destinatario) {
        this.imagen_destinatario = imagen_destinatario;
        this.iva_12 = iva_12;
        this.num_tarjeta = num_tarjeta;
        this.num_cheque = num_cheque;
        this.local_retiro = local_retiro;
        this.tipo_transporte = tipo_transporte;
        Descripcion = descripcion;
        Transporte = transporte;
        this.subtotal_12 = subtotal_12;
        this.subtotal_iva = subtotal_iva;
        this.subtotal = subtotal;
        this.iva = iva;
        this.valor_total = valor_total;
        this.forma_de_pago = forma_de_pago;
        this.banco = banco;
        Anticipo = anticipo;
        this.costo_transporte = costo_transporte;
        Saldo = saldo;
        this.hora = hora;
        this.producto = producto;
    }

    public Object[][] getImagen_destinatario() {
        return imagen_destinatario;
    }

    public void setImagen_destinatario(Object[][] imagen_destinatario) {
        this.imagen_destinatario = imagen_destinatario;
    }

    public String getNum_tarjeta() {
        return num_tarjeta;
    }

    public void setNum_tarjeta(String num_tarjeta) {
        this.num_tarjeta = num_tarjeta;
    }

    public String getNum_cheque() {
        return num_cheque;
    }

    public void setNum_cheque(String num_cheque) {
        this.num_cheque = num_cheque;
    }

    public String getLocal_retiro() {
        return local_retiro;
    }

    public void setLocal_retiro(String local_retiro) {
        this.local_retiro = local_retiro;
    }

    public String getTipo_transporte() {
        return tipo_transporte;
    }

    public void setTipo_transporte(String tipo_transporte) {
        this.tipo_transporte = tipo_transporte;
    }

    public double getIva_12() {
        return iva_12;
    }

    public void setIva_12(double iva_12) {
        this.iva_12 = iva_12;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public Long getId_orden_cuerpo() {
        return id_orden_cuerpo;
    }

    public void setId_orden_cuerpo(Long id_orden_cuerpo) {
        this.id_orden_cuerpo = id_orden_cuerpo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getTransporte() {
        return Transporte;
    }

    public void setTransporte(String transporte) {
        Transporte = transporte;
    }

    public double getSubtotal_12() {
        return subtotal_12;
    }

    public void setSubtotal_12(double subtotal_12) {
        this.subtotal_12 = subtotal_12;
    }

    public double getSubtotal_iva() {
        return subtotal_iva;
    }

    public void setSubtotal_iva(double subtotal_iva) {
        this.subtotal_iva = subtotal_iva;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public String getForma_de_pago() {
        return forma_de_pago;
    }

    public void setForma_de_pago(String forma_de_pago) {
        this.forma_de_pago = forma_de_pago;
    }

    public double getAnticipo() {
        return Anticipo;
    }

    public void setAnticipo(double anticipo) {
        Anticipo = anticipo;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public double getCosto_transporte() {
        return costo_transporte;
    }

    public void setCosto_transporte(double costo_ransporte) {
        this.costo_transporte = costo_ransporte;
    }

    public Object[][] getProducto() {
        return producto;
    }

    public void setProducto(Object[][] producto) {
        this.producto = producto;
    }

}