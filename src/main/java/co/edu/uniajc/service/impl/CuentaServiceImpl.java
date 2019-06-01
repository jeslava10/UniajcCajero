package co.edu.uniajc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uniajc.dao.Dao;
import co.edu.uniajc.model.Cuenta;
import co.edu.uniajc.service.CuentaService;

@Service
public class CuentaServiceImpl implements CuentaService {

	@Autowired
	private Dao CuentaDao;	

	@Override
	public Cuenta findById(int id){
		return null;
		//		return CuentaDao.findById(id);
	}

	@Override
	public void save(Cuenta Cuenta) {
		CuentaDao.save(Cuenta);
	}

	@Override
	public void update(Cuenta Cuenta) {
		CuentaDao.update(Cuenta);
	}

	@Override
	public List<Cuenta> listaCuenta(){

		List<Cuenta> Cuenta = null;
		Cuenta = CuentaDao.list(Cuenta.class);
		return Cuenta;
	}

	@Override
	public void delete(Cuenta Cuenta) {
		CuentaDao.delete(Cuenta);
	}

}
