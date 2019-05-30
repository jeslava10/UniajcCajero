package co.edu.uniajc.service;

import java.util.List;

import co.edu.uniajc.model.Cajero;


public interface CajeroService {
	
	public Cajero findById(int id);
	public void save(Cajero Cajero);
	public void update(Cajero Cajero);
	public List<Cajero> listaCajero();
	public void delete(Cajero Cajero) ;
	
}
