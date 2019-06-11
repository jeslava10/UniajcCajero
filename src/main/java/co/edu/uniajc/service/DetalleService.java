package co.edu.uniajc.service;

import java.util.List;

import co.edu.uniajc.model.Detalle;


public interface DetalleService {
	
	public Detalle findById(int id);
	public void save(Detalle Detalle);
	public void update(Detalle Detalle);
	public List<Detalle> listaDetalle();
	public void delete(Detalle Detalle) ;
	
}
