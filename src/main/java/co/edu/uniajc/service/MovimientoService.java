package co.edu.uniajc.service;

import java.util.List;

import co.edu.uniajc.model.Movimiento;


public interface MovimientoService {
	
	public Movimiento findById(int id);
	public void save(Movimiento Movimiento);
	public void update(Movimiento Movimiento);
	public List<Movimiento> listaMovimiento();
	public void delete(Movimiento Movimiento) ;
	
}
