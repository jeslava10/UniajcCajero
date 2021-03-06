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
 * Cuenta generated by hbm2java
 */

@Entity
@Table(name = "cuenta")
public class Cuenta implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_cuenta")
	private Integer idCuenta;
	
	@Column(name = "numero")
	private String numero;
	
	@JoinColumn(name = "id_banco", nullable = true, updatable = false)
    @ManyToOne(fetch = FetchType.EAGER)
	private Banco banco;
	
	@JoinColumn(name = "id_estado", nullable = true, updatable = false)
    @ManyToOne(fetch = FetchType.EAGER)
	private Estado estado;
	
	@JoinColumn(name = "id_producto", nullable = true, updatable = false)
    @ManyToOne(fetch = FetchType.EAGER)
	private Producto producto;
	
	@JoinColumn(name = "id_usuario", nullable = true, updatable = false)
    @ManyToOne(fetch = FetchType.EAGER)
	private Usuario usuario;
	
	@Column(name = "saldo")
	private BigDecimal saldo;
	
	@Column(name = "clave")
	private String clave;
	
	public Cuenta() {
	}

	public Cuenta(Banco banco, Estado estado, Producto producto, Usuario usuario, String numero, BigDecimal saldo,
			String clave) {
		this.banco = banco;
		this.estado = estado;
		this.producto = producto;
		this.usuario = usuario;
		this.numero = numero;
		this.saldo = saldo;
		this.clave = clave;
	}

	public Integer getIdCuenta() {
		return this.idCuenta;
	}

	public void setIdCuenta(Integer idCuenta) {
		this.idCuenta = idCuenta;
	}

	public Banco getBanco() {
		return this.banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public BigDecimal getSaldo() {
		return this.saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}


}
