package co.edu.uniajc.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.PrimeFaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.edu.uniajc.model.Estado;
import co.edu.uniajc.service.EstadoService;

@Component
@ManagedBean(name = "EstadoBean", eager = true)
@RequestScoped
public class EstadoBean {

	// @ManagedProperty(value = "#{message}") esto se usa en objetos que contengan
	// datos

	@Autowired
	private EstadoService EstadoService;
	private List<Estado> ListEstado;
	private Integer idEstado;
	private String descripcion;

	public EstadoService getEstadoService() {
		return EstadoService;
	}

	public void setEstadoService(EstadoService EstadoService) {
		this.EstadoService = EstadoService;
	}

	public List<Estado> getListEstado() {
		return ListEstado;
	}

	public void setListEstado(List<Estado> listEstado) {
		ListEstado = listEstado;
	}

	public Integer getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}

	public void limpiarVariables() {
		this.idEstado = 0;
		this.descripcion = "";

	}

	public String addEstado() {

		Estado Estado = new Estado();
		Estado.setIdEstado(getIdEstado());
		Estado.setDescripcion(getDescripcion());

		EstadoService.save(Estado);
		this.limpiarVariables();
		return "EstadoViews.xhtml?faces-redirect=true";

	}

	public String updateEstado() {

		Estado EstadoSeleccionado = new Estado();
		EstadoSeleccionado.setNit(getNit());
		EstadoSeleccionado.setNombre(getNombre());
		EstadoSeleccionado.setDireccion(getDireccion());
		EstadoSeleccionado.setTelefono(getTelefono());
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