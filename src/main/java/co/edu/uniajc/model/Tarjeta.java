package co.edu.uniajc.model;
// Generated 20/04/2019 10:28:16 AM by Hibernate Tools 5.1.0.Alpha1

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
 * Tarjeta generated by hbm2java
 */
@Entity
@Table(name = "tarjeta")
public class Tarjeta implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_tarjeta")
	private Integer idTarjeta;
	
	@JoinColumn(name = "id_cuenta", nullable = true, updatable = false)
    @ManyToOne(fetch = FetchType.EAGER)
	private Cuenta cuenta;
	
	@JoinColumn(name = "id_estado", nullable = true, updatable = false)
    @ManyToOne(fetch = FetchType.EAGER)
	private Estado estado;
	
	@Column(name = "numero")
	private String numero;
	
	@Column(name = "validthru")
	private Date validthru;
	
	@Column(name = "ind_block")
	private int indBlock;
	
	@Column(name = "clave")
	private String clave;
	
	@Column(name = "fec_creacion")
	private Date fecCreacion;
	
	public Tarjeta() {
	}

	public Tarjeta(Cuenta cuenta, Estado estado, String numero, Date validthru, int indBlock, String clave , Date fecCreacion) {
		this.cuenta = cuenta;
		this.estado = estado;
		this.numero = numero;
		this.validthru = validthru;
		this.indBlock = indBlock;
		this.clave = clave;
		this.fecCreacion = fecCreacion;
	}
	
	public Integer getIdTarjeta() {
		return this.idTarjeta;
	}

	public void setIdTarjeta(Integer idTarjeta) {
		this.idTarjeta = idTarjeta;
	}

	public Cuenta getCuenta() {
		return this.cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getValidthru() {
		return this.validthru;
	}

	public void setValidthru(Date validthru) {
		this.validthru = validthru;
	}

	public int getIndBlock() {
		return this.indBlock;
	}

	public void setIndBlock(int indBlock) {
		this.indBlock = indBlock;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Date getFecCreacion() {
		return this.fecCreacion;
	}

	public void setFecCreacion(Date fecCreacion) {
		this.fecCreacion = fecCreacion;
	}


}
