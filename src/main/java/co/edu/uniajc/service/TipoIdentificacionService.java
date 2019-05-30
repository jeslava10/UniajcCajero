package co.edu.uniajc.service;

import java.util.List;

import co.edu.uniajc.model.TipoIdentificacion;


public interface TipoIdentificacionService {
	
	public TipoIdentificacion findById(int id);
	public void save(TipoIdentificacion TipoIdentificacion);
	public void update(TipoIdentificacion TipoIdentificacion);
	public List<TipoIdentificacion> listaTipoIdentificacion();
	public void delete(TipoIdentificacion TipoIdentificacion) ;
	
}
