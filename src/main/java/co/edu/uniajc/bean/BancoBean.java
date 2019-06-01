package co.edu.uniajc.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.PrimeFaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.edu.uniajc.model.Banco;
import co.edu.uniajc.service.BancoService;


@ManagedBean(name = "bancoBean", eager = true)
@RequestScoped
public class BancoBean {

	// @ManagedProperty(value = "#{message}") esto se usa en objetos que contengan
	// datos

	@Autowired
	private BancoService bancoService;
	
    private Banco banco = new Banco();
    
	private List<Banco> ListBanco;
	
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

	
	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public void limpiarVariables() {

	}

	public String  addbanco() {
		
		bancoService.save(banco);
		this.limpiarVariables();
        this.banco = new Banco();
		return "BancoViews.xhtml?faces-redirect=true";

	}

	public void  updatebanco() {
		
		bancoService.update(banco);
		this.limpiarVariables();
		 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Update successful"));

	}

	public String deletebanco() {

		bancoService.delete(banco);
		return "BancoViews.xhtml?faces-redirect=true";

	}


	public List<Banco> getAllbancos() {
		
		ListBanco = null;
		ListBanco = bancoService.listaBanco();
		return ListBanco;
		
	}


}