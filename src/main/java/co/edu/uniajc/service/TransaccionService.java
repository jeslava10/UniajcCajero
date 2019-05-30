package co.edu.uniajc.service;

import java.util.List;

import co.edu.uniajc.model.Transaccion;


public interface TransaccionService {
	
	public Transaccion findById(int id);
	public void save(Transaccion Transaccion);
	public void update(Transaccion Transaccion);
	public List<Transaccion> listaTransaccion();
	public void delete(Transaccion Transaccion) ;
	
}
