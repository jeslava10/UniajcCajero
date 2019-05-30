package co.edu.uniajc.model;
// Generated 20/04/2019 10:28:16 AM by Hibernate Tools 5.1.0.Alpha1

import java.math.BigDecimal;

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
 * Detalle generated by hbm2java
 */
@Entity
@Table(name  = "detalle")
public class Detalle implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_detalle")
	private Integer  id;
	
	@JoinColumn(name = "id_cuenta", nullable = true, updatable = false)
    @ManyToOne(fetch = FetchType.EAGER)
	private Cuenta cuenta;
	
	@JoinColumn(name = "id_movimiento", nullable = true, updatable = false)
    @ManyToOne(fetch = FetchType.EAGER)
	private Movimiento movimiento;
	
	@JoinColumn(name = "id_tareta", nullable = true, updatable = false)
    @ManyToOne(fetch = FetchType.EAGER)
	private Tarjeta tarjeta;
	
	@JoinColumn(name = "id_transaccion", nullable = true, updatable = false)
    @ManyToOne(fetch = FetchType.EAGER)
	private Transaccion transaccion;
	
	@Column(name = "monto")
	private BigDecimal monto;

	public Detalle() {
	}

	public Detalle(Integer id, Cuenta cuenta, Movimiento movimiento, Transaccion transaccion) {
		this.id = id;
		this.cuenta = cuenta;
		this.movimiento = movimiento;
		this.transaccion = transaccion;
	}

	public Detalle(Integer id, Cuenta cuenta, Movimiento movimiento, Tarjeta tarjeta, Transaccion transaccion,
			BigDecimal monto) {
		this.id = id;
		this.cuenta = cuenta;
		this.movimiento = movimiento;
		this.tarjeta = tarjeta;
		this.transaccion = transaccion;
		this.monto = monto;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cuenta getCuenta() {
		return this.cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public Movimiento getMovimiento() {
		return this.movimiento;
	}

	public void setMovimiento(Movimiento movimiento) {
		this.movimiento = movimiento;
	}

	public Tarjeta getTarjeta() {
		return this.tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	public Transaccion getTransaccion() {
		return this.transaccion;
	}

	public void setTransaccion(Transaccion transaccion) {
		this.transaccion = transaccion;
	}

	public BigDecimal getMonto() {
		return this.monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

}
