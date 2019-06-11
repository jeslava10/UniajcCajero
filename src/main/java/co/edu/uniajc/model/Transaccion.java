package co.edu.uniajc.model;
// Generated 20/04/2019 10:28:16 AM by Hibernate Tools 5.1.0.Alpha1

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Transaccion generated by hbm2java
 */
@Entity
@Table(name = "transaccion")
public class Transaccion implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_transaccion")
	private Integer idTransaccion;
	
	@JoinColumn(name = "id_cajero", nullable = true, updatable = false)
    @ManyToOne(fetch = FetchType.EAGER)
	private Cajero cajero;
	
	@Column(name = "fec_creacion")
	private Date fecCreacion;
	
	@JoinColumn(name = "ind_estado", nullable = true, updatable = false)
    @ManyToOne(fetch = FetchType.EAGER)
	private Estado indEstado;
	
	@Column(name = "valor")
	private BigDecimal valor;

	public Transaccion() {
	}

	public Transaccion(Cajero cajero, Date fecCreacion, Estado indEstado , BigDecimal valor) {
		this.cajero = cajero;
		this.fecCreacion = fecCreacion;
		this.indEstado = indEstado;
		this.valor = valor;
	}

	
	public Integer getIdTransaccion() {
		return this.idTransaccion;
	}

	public void setIdTransaccion(Integer idTransaccion) {
		this.idTransaccion = idTransaccion;
	}

	public Cajero getCajero() {
		return this.cajero;
	}

	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	public Date getFecCreacion() {
		return this.fecCreacion;
	}

	public void setFecCreacion(Date fecCreacion) {
		this.fecCreacion = fecCreacion;
	}

	public Estado getIndEstado() {
		return this.indEstado;
	}

	public void setIndEstado(Estado indEstado) {
		this.indEstado = indEstado;
	}

	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}