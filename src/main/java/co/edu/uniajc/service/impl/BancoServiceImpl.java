package co.edu.uniajc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import co.edu.uniajc.dao.Dao;
import co.edu.uniajc.model.Banco;
import co.edu.uniajc.service.BancoService;

@Service
public class BancoServiceImpl implements BancoService {

	@Autowired
	private Dao BancoDao;	

	@Override
	public Banco findById(int id){
		return null;
		//		return BancoDao.findById(id);
	}

	@Override
	public void save(Banco Banco) {
		BancoDao.save(Banco);
	}

	@Override
	public void update(Banco Banco) {
		BancoDao.update(Banco);
	}

	@Override
	public List<Banco> listaBanco(){

		List<Banco> Banco = null;
		Banco = BancoDao.list(Banco.class);
		return Banco;
	}

	@Override
	public void delete(Banco Banco) {
		BancoDao.delete(Banco);
	}

}
