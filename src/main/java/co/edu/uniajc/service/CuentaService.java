package co.edu.uniajc.service;

import java.util.List;

import co.edu.uniajc.model.Cuenta;


public interface CuentaService {
	
	public Cuenta findById(int id);
	public void save(Cuenta Cuenta);
	public void update(Cuenta Cuenta);
	public List<Cuenta> listaCuenta();
	public void delete(Cuenta Cuenta) ;
	
}
