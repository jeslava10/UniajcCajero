package co.edu.uniajc.service;

import java.util.List;

import co.edu.uniajc.model.Usuario;


public interface UsuarioService {
	
	public Usuario findById(int id);
	public void save(Usuario Usuario);
	public void update(Usuario Usuario);
	public List<Usuario> listaUsuario();
	public void delete(Usuario Usuario) ;
	
}
