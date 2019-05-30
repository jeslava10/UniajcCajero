package co.edu.uniajc.service;

import java.util.List;

import co.edu.uniajc.model.Tarjeta;


public interface TarjetaService {
	
	public Tarjeta findById(int id);
	public void save(Tarjeta Tarjeta);
	public void update(Tarjeta Tarjeta);
	public List<Tarjeta> listaTarjeta();
	public void delete(Tarjeta Tarjeta) ;
	
}
