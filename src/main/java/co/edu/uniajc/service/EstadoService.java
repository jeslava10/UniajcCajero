package co.edu.uniajc.service;

import java.util.List;

import co.edu.uniajc.model.Estado;


public interface EstadoService {
	
	public Estado findById(int id);
	public void save(Estado Estado);
	public void update(Estado Estado);
	public List<Estado> listaEstado();
	public void delete(Estado Estado) ;
	
}
