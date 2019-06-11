package co.edu.uniajc.bean;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import co.edu.uniajc.model.Estado;
import co.edu.uniajc.service.EstadoService;

@Named("EstadoBean")
@RequestScoped
public class EstadoBean implements Serializable {

	private static final long serialVersionUID = 5144116505060259792L;

	// @ManagedProperty(value = "#{message}") esto se usa en objetos que contengan
	// datos

	@Inject
	private EstadoService EstadoService;

	private List<Estado> ListEstado;

	private Integer idEstado;
	private String Descripcion;

	public Integer getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}

	public void setDescripcion(String Descripcion) {
		this.Descripcion = Descripcion;
	}

	public List<Estado> getListEstado() {
		return ListEstado;
	}

	public void setListEstado(List<Estado> listEstado) {
		ListEstado = listEstado;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void limpiarVariables() {
		this.idEstado = 0;
		this.Descripcion = "";
	}

	public String addEstado() {

		Estado Estado = new Estado();
		Estado.setIdEstado(getIdEstado());
		Estado.setDescripcion(getDescripcion());
		this.limpiarVariables();
		return "EstadoViews.xhtml?faces-redirect=true";

	}

	public String updateEstado() {

		Estado EstadoSeleccionado = new Estado();
		EstadoSeleccionado.setIdEstado(getIdEstado());
		EstadoSeleccionado.setDescripcion(getDescripcion());
		EstadoService.update(EstadoSeleccionado);
		this.limpiarVariables();
		return "EstadoViews.xhtml?faces-redirect=true";

	}

	public String deleteEstado(Estado Estado) {

		EstadoService.delete(Estado);
		EstadoService.save(Estado);
		return "EstadoViews.xhtml?faces-redirect=true";

	}

//	public List<Estado> getAllEstados() {
//		
//		ListEstado = null;
//		ListEstado = EstadoService.listaEstado();
//		return ListEstado;
//		
//	}

}