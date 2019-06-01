package co.edu.uniajc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import co.edu.uniajc.dao.Dao;
import co.edu.uniajc.model.Estado;
import co.edu.uniajc.service.EstadoService;

@Service
public class EstadoServiceImpl implements EstadoService {

	@Autowired
	private Dao EstadoDao;	

	@Override
	public Estado findById(int id){
		return null;
		//		return EstadoDao.findById(id);
	}

	@Override
	public void save(Estado Estado) {
		EstadoDao.save(Estado);
	}

	@Override
	public void update(Estado Estado) {
		EstadoDao.update(Estado);
	}

	@Override
	public List<Estado> listaEstado(){

		List<Estado> Estado = null;
		Estado = EstadoDao.list(Estado.class);
		return Estado;
	}

	@Override
	public void delete(Estado Estado) {
		EstadoDao.delete(Estado);
	}

}
