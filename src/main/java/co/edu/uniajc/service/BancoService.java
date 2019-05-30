package co.edu.uniajc.service;

import java.util.List;

import org.hibernate.Session;

import co.edu.uniajc.model.Banco;


public interface BancoService {
	
	public Banco findById(int id);
	public void save(Banco Banco);
	public void update(Banco Banco);
	public List<Banco> listaBanco();
	public void delete(Banco Banco) ;
	
}
