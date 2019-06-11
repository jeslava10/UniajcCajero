package co.edu.uniajc.model;
// Generated 28/03/2019 07:09:46 PM by Hibernate Tools 5.3.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TipoIdentificacion generated by hbm2java
 */
@Entity
@Table(name = "tipo_identificacion")
public class TipoIdentificacion implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_identificacion")
	private Integer idIdentificacion;
	
	@Column(name = "descripcion")
	private String descripcion;

	public TipoIdentificacion() {
	}
	
	public TipoIdentificacion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Integer getIdIdentificacion() {
		return this.idIdentificacion;
	}

	public void setIdIdentificacion(Integer idIdentificacion) {
		this.idIdentificacion = idIdentificacion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
}
