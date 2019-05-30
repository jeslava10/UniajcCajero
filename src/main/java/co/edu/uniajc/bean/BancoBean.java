package co.edu.uniajc.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.PrimeFaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.edu.uniajc.model.Banco;
import co.edu.uniajc.service.BancoService;

@Component
@ManagedBean(name = "bancoBean", eager = true)
@RequestScoped
public class BancoBean {

	// @ManagedProperty(value = "#{message}") esto se usa en objetos que contengan
	// datos

	@Autowired
	private BancoService bancoService;
	
	private List<Banco> ListBanco;
	
	private Integer idBanco;
	
	private String nit;

	private String nombre;
	
	private String direccion;
	
	private String telefono;
	
	
    public BancoService getBancoService() {
		return bancoService;
	}

	public void setBancoService(BancoService bancoService) {
		this.bancoService = bancoService;
	}

	public List<Banco> getListBanco() {
		return ListBanco;
	}

	public void setListBanco(List<Banco> listBanco) {
		ListBanco = listBanco;
	}

	public Integer getIdBanco() {
		return idBanco;
	}

	public void setIdBanco(Integer idBanco) {
		this.idBanco = idBanco;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void limpiarVariables() {
		this.idBanco = 0;
		
		this.nit = "";

		this.nombre= "";
		
		this.direccion= "";
		
		this.telefono= "";

	}

	public String  addbanco() {
		
    	Banco banco = new Banco();
    	banco.setNit(getNit());
    	banco.setNombre(getNombre());
    	banco.setDireccion(getDireccion());
    	banco.setTelefono(getTelefono());
		bancoService.save(banco);
		this.limpiarVariables();
		return "BancoViews.xhtml?faces-redirect=true";

	}

	public String  updatebanco() {
    	
		Banco bancoSeleccionado = new Banco();
		bancoSeleccionado.setNit(getNit());
		bancoSeleccionado.setNombre(getNombre());
		bancoSeleccionado.setDireccion(getDireccion());
		bancoSeleccionado.setTelefono(getTelefono());
		bancoService.update(bancoSeleccionado);
		this.limpiarVariables();
		return "BancoViews.xhtml?faces-redirect=true";

	}

	public String deletebanco(Banco banco) {

		bancoService.delete(banco);
		bancoService.save(banco);
		return "BancoViews.xhtml?faces-redirect=true";

	}


//	public List<Banco> getAllbancos() {
//		
//		ListBanco = null;
//		ListBanco = bancoService.listaBanco();
//		return ListBanco;
//		
//	}


}