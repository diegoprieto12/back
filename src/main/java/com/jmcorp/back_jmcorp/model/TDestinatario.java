package com.jmcorp.back_jmcorp.model;

import java.io.Serializable;
import java.util.Date;
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

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "destinatario")
public class TDestinatario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqDestinatario")
	@SequenceGenerator(name = "seqDestinatario", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_DESTINATARIO_ID")
	private Long id_destinatario;

	private String cedula_destinatario;
	private String nombre_destinatario;
	private String apellido_destinatario;
	private String celular_destinatario;
	private String direccion_destinatario;
	private Date fecha_destinatario;
	@DateTimeFormat(pattern = "hh:mm")
    private Date hora_destinatario;

	// @OneToOne(fetch = FetchType.LAZY)
	// @JoinColumn(name = "id_pedido")
	// @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	// private TPedido pedido;

	@OneToMany(mappedBy = "destinatario")
	private List<TOrdenCabecera> ordenCabecera;

	public TDestinatario() {
	}

	public TDestinatario(Long id_destinatario, String nombre_destinatario, String apellido_destinatario,
			String celular_destinatario, String direccion_destinatario, Date fecha_destinatario,
			String cedula_destinatario,Date hora_destinatario) {
				this.hora_destinatario = hora_destinatario;
		this.cedula_destinatario = cedula_destinatario;
		this.id_destinatario = id_destinatario;
		this.nombre_destinatario = nombre_destinatario;
		this.apellido_destinatario = apellido_destinatario;
		this.celular_destinatario = celular_destinatario;
		this.direccion_destinatario = direccion_destinatario;
		this.fecha_destinatario = fecha_destinatario;
	}

	
	public Date getHora_destinatario() {
		return hora_destinatario;
	}

	public void setHora_destinatario(Date hora_destinatario) {
		this.hora_destinatario = hora_destinatario;
	}

	public String getCedula_destinatario() {
		return cedula_destinatario;
	}

	public void setCedula_destinatario(String cedula_destinatario) {
		this.cedula_destinatario = cedula_destinatario;
	}

	public Long getId_destinatario() {
		return id_destinatario;
	}

	public void setId_destinatario(Long id_destinatario) {
		this.id_destinatario = id_destinatario;
	}

	public String getNombre_destinatario() {
		return nombre_destinatario;
	}

	public void setNombre_destinatario(String nombre_destinatario) {
		this.nombre_destinatario = nombre_destinatario;
	}

	public String getApellido_destinatario() {
		return apellido_destinatario;
	}

	public void setApellido_destinatario(String apellido_destinatario) {
		this.apellido_destinatario = apellido_destinatario;
	}

	public String getCelular_destinatario() {
		return celular_destinatario;
	}

	public void setCelular_destinatario(String celular_destinatario) {
		this.celular_destinatario = celular_destinatario;
	}

	public String getDireccion_destinatario() {
		return direccion_destinatario;
	}

	public void setDireccion_destinatario(String direccion_destinatario) {
		this.direccion_destinatario = direccion_destinatario;
	}

	public Date getFecha_destinatario() {
		return fecha_destinatario;
	}

	public void setFecha_destinatario(Date fecha_destinatario) {
		this.fecha_destinatario = fecha_destinatario;
	}

}
