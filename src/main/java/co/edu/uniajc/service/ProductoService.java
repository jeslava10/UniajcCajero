package co.edu.uniajc.service;

import java.util.List;

import co.edu.uniajc.model.Producto;


public interface ProductoService {
	
	public Producto findById(int id);
	public void save(Producto Producto);
	public void update(Producto Producto);
	public List<Producto> listaProducto();
	public void delete(Producto Producto) ;
	
}
